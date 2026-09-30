import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


/**
 * The main class for the application.
 * Shows a list of files and commands. Allows user to add, remove, and view tasks.
 * Has a section for completed tasks, in progress, and a section for incomplete tasks.
 */
public class main {

    private boolean 
    public static void main(String[] args) {

        Scanner kb = new Scanner(system.in);
        
        while (isValidInput(kb) != true) {

        }

    }

    public boolean isValidInput(String input) {
        case "0", "1", "2", "3", "4", "5", "q" -> true;
        default -> false;
    }