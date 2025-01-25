package lld.src.main.java.org.lokeshdarla.machinecoding.tictactoe.models;

import org.lokeshdarla.machinecoding.tictactoe.exceptions.InvalidGameConstructionParametersException;
import org.lokeshdarla.machinecoding.tictactoe.strategies.gamewinningstrategy.GameWinningStrategy;
import org.lokeshdarla.machinecoding.tictactoe.strategies.gamewinningstrategy.OrderOneGameWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private GameState gameState;
    private int nextPlayerIndex;
    private GameWinningStrategy gameWinningStrategy;
    private Player winner;

    public Player getWinner() {
        return this.winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameWinningStrategy getGameWinningStrategy() {
        return this.gameWinningStrategy;
    }

    public void setGameWinningStrategy(GameWinningStrategy gameWinningStrategy) {
        this.gameWinningStrategy = gameWinningStrategy;
    }

    private Game() {
    }

    public void undo() {

    }

    public void makeNextMove() {

    }

    public void displayBoard() {
        this.board.display();
    }

    public GameState getGameStatus() {
        return this.gameState;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public GameState getGameState() {
        return this.gameState;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<Move> getMoves() {
        return this.moves;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return this.board;
    }

    private void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private boolean valid() throws InvalidGameConstructionParametersException {
            if (this.dimension < 3) {
                throw new InvalidGameConstructionParametersException("Dimension of game can't be < 3");
            }
            if (this.players.size() != this.dimension - 1) {
                throw new InvalidGameConstructionParametersException("Number of players must be dimension - 1");
            }

            // Validate no 2 people with same symbol

            // Validate that there should be only 1 bot

            // TODO:: Add more validations

            return true;
        }

        public Game build() throws InvalidGameConstructionParametersException {
            try {
                valid();
            } catch (Exception e) {
                throw new InvalidGameConstructionParametersException(e.getMessage());
            }

            Game game = new Game();
            game.setGameState(GameState.IN_PROGRESS);
            game.setPlayers(players);
            game.setMoves(new ArrayList<>());
            game.setBoard(new Board(dimension));
            game.setNextPlayerIndex(0);
            game.setGameWinningStrategy(new OrderOneGameWinningStrategy(dimension));

            return game;
        }
    }

    private void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

}
