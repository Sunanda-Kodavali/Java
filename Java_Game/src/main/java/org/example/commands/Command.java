package org.example.commands;


import org.example.Game.GameState;

public interface Command {
    void execute (GameState gs) throws Exception;
}
