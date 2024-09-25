package commands;
import Game.GameState;

public interface Command {
    void execute (GameState gs) throws Exception;
}
