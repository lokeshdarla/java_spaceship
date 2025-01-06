package org.lokeshdarla.machinecoding.tictactoe.strategies.gamewinningstrategy;

import org.lokeshdarla.machinecoding.tictactoe.models.Board;
import org.lokeshdarla.machinecoding.tictactoe.models.Cell;
import org.lokeshdarla.machinecoding.tictactoe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board,
                        Player lastMovePlayer,
                        Cell moveCell);
}
