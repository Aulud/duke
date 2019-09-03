package duke.component;

import java.util.Scanner;
import java.lang.StringBuilder;

public class Window {
    private static final String DIVIDER_PROTOTYPE = "____________________________________________________";
    private static final String DIVIDER_BAR = String.format(
        "    %s%s\n",
        Window.DIVIDER_PROTOTYPE,
        Window.DIVIDER_PROTOTYPE
    );
    
    private Scanner sc;

    /**
     *  Creates a <code>Ui</code> object that handles user interactions.
     */
    public Window() {
        this.sc = new Scanner(System.in);
    }

    /**
     *  Displays the welcome message for the <code>Duke</code> application.
     */
    public void showWelcome(String logo, String introduction) {
        System.out.println(logo);
        this.print(introduction);
    }

    /**
     *  Returns a <code>boolean</code> signifying if there is input to be read.
     *  @return <code>true</code> if there is user input to be read from <code>System.in</code>.
     */
    public boolean hasCommand() {
        return this.sc.hasNext();
    }

    /**
     *  Returns a <code>String</code> containing the next line of input read from <code>System.in</code>.
     *  @return the input <code>String</code> read from <code>System.in</code>.
     */
    public String readCommand() {
        return this.sc.nextLine().trim();
    }

    /** 
     *  Pretty-prints a given message string to the standard output stream, adding indentation and horizontal lines
     *  to the message.
     *  @param message a <code>String</code> to embellish then print to <code>System.out</code>.
     */
    public void print(String message) {
        StringBuilder result = new StringBuilder();
        
        result.append(Window.DIVIDER_BAR)
              .append("\n");

        // Retrieves each individual line in the message and pads them with spaces to the left
        String[] lines = message.split("\n");
        for (String line: lines) {
            result.append("     ")
                  .append(line)
                  .append("\n");
        }
        
        result.append(Window.DIVIDER_BAR);
        System.out.println(result.toString());
    }
}
