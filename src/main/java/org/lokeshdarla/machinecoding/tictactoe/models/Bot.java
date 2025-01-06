package org.lokeshdarla.machinecoding.tictactoe.models;

import org.lokeshdarla.machinecoding.tictactoe.factories.BotPlayingStrategyFactory;
import org.lokeshdarla.machinecoding.tictactoe.strategies.botplayingstrategy.BotPlayingStrategy;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot( char aSymbol,String name, BotDifficultyLevel difficultyLevel) {
        super(aSymbol,name, PlayerType.BOT);
        this.botDifficultyLevel = difficultyLevel;
        this.botPlayingStrategy = BotPlayingStrategyFactory.getStrategyForDifficultyLevel(difficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    @Override
    public Move decideMove(Board board) {
        return null;
    }
}
