package lld.src.main.java.org.lokeshdarla.machinecoding.tictactoe.models;

public class Player {
    private char symbol;
    private String playerName;
    private PlayerType playerType;

    public Player(char symbol, String playerName, PlayerType playerType) {
        this.symbol = symbol;
        this.playerName = playerName;
        this.playerType = playerType;
    }

    public Move decideMove() {
        return null;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public String getPlayerName() {
        return this.playerName;
    }

    public PlayerType getPlayerType() {
        return this.playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
