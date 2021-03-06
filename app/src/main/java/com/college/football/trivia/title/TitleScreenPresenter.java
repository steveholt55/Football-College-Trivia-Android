package com.college.football.trivia.Title;

import com.college.football.trivia.Model.Game;
import com.college.football.trivia.R;
import com.college.football.trivia.Util.GameController;

public class TitleScreenPresenter {
    private TitleScreenView view;

    public TitleScreenPresenter(TitleScreenView view ) {
        this.view = view;
    }

    public void startGame(int id) {
        switch (id) {
            case R.id.standardGame:
                view.showDifficultyDialog(Game.Mode.Standard);
                break;
            case R.id.survivalGame:
                view.showDifficultyDialog(Game.Mode.Survival);
                break;
            case R.id.practiceGame:
                view.showDifficultyDialog(Game.Mode.Practice);
                break;
        }
    }
}