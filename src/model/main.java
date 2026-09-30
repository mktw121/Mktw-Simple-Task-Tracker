package model;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


/**
 * The main class for the application.
 * Shows a list of files and commands. Allows user to add, remove, and view tasks.
 * Has a section for completed tasks, in progress, and a section for incomplete tasks.
 */
public class main {

    private String userInput;
    private static final String barString = ("====================================");

    public main(String userInput) {
        this.userInput = userInput;

    }
    /**
     * In linear time checks if a user has a correct input.
     * @param input
     * @return true if valid input, false if invalid input.
     */
    public boolean isValidInput(String input) {
        return switch (input) { // Ensures user puts valid input.
        case "0", "1", "2", "3", "4", "5", "q" -> true;
        default -> false;
        };
    }

    /**
     * Asks user for command.
     */
    public void userCommand(String userInput) {

        while (isValidInput(userInput) != true) {


        }
    }

    public String toString() {
        return null;
    }

    public static void main(String[] args) {

    Scanner kb = new Scanner(system.in);

    System.out.println(barString);
    System.out.println(" ");
    System.out.println(barString);
    System.
    String userInput = kb.nextLine();
    

    }

    // TODO: Add a new class that alerts you of task deadlines
}