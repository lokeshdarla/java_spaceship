package lld.src.main.java.org.lokeshdarla.machinecoding.tictactoe.factories;

import org.lokeshdarla.machinecoding.tictactoe.models.BotDifficultyLevel;
import org.lokeshdarla.machinecoding.tictactoe.strategies.botplayingstrategy.BotPlayingStrategy;
import org.lokeshdarla.machinecoding.tictactoe.strategies.botplayingstrategy.RandomBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategyForDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        return new RandomBotPlayingStrategy();
    }
}
