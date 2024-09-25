package commands;

import Game.GameState;
import types.Danger;
import types.Direction;
import types.Location;

import java.util.Random;

import static types.Danger.*;

public class MoveCommand implements Command {

    private final Direction direction;

    public MoveCommand(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void execute(GameState gs) throws Exception {
        gs.decreaseStepsRemaining();

        Location nextLocation;
        if (this.direction == Direction.LEFT) {
            nextLocation = gs.getNextLeft();
        } else if (this.direction == Direction.RIGHT) {
            nextLocation = gs.getNextRight();
        } else {
            throw new RuntimeException("This direction is not implemented in the MoveCommand");
        }

        gs.setCurrentArea(nextLocation.getArea());

        // We will check for danger and only reward if nothing happens
        // switch-case depending on the kind of danger: Bear/Shark: 30%, BEAR_SHARK: 50%



        // Retrieve the type of danger at the next location
        Danger danger = nextLocation.getDanger();

        // Initialize random number generator for danger determination
        Random random = new Random();
        int dangerChance = random.nextInt(100); // Generates a number between 0 and 99

        // We will check for danger and only reward if nothing happens
        boolean dangerOccurred = false;
        switch (danger) {
            case BEAR:
                // 30% chance of encountering a bear
                if (dangerChance < 30) {
                    dangerOccurred = true;
                    System.out.println("You encountered a bear!");

                }
                break;
            case SHARK:
                // 30% chance of encountering a shark
                if (dangerChance < 30) {
                    dangerOccurred = true;
                    System.out.println("You encountered a shark!");
                    // Handle the danger effect
                }
                break;
            case BEAR_SHARK:
                // 50% chance of encountering a bear-shark hybrid
                if (dangerChance < 50) {
                    dangerOccurred = true;
                    System.out.println("You encountered a terrifying Bear-Shark!");
                    // Handle the danger effect
                }
                break;
            case NONE:
            default:
                // No danger, proceed normally
                break;
        }

        if (!dangerOccurred) {
            gs.addScales(nextLocation.getReward());
            System.out.println("You received " + nextLocation.getReward() + " scales as a reward!");
        }

        gs.addScales(nextLocation.getReward());
    }
}
