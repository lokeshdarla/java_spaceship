package lld.src.main.java.org.lokeshdarla.machinecoding.tictactoe.strategies.botplayingstrategy;

import org.lokeshdarla.machinecoding.tictactoe.models.Move;
import org.lokeshdarla.machinecoding.tictactoe.models.Player;
import org.lokeshdarla.machinecoding.tictactoe.models.Board;

public interface BotPlayingStrategy {
    Move decideMove(Player player, Board board);
}
