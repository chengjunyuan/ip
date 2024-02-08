package gronk;

/**
 * DukeException class.
 * Generic exception when a command is not recognized.
 */
public class DukeException extends Exception {
    public DukeException() {}

    public DukeException(String m) {
        super(m);
    }

    @Override
    public String toString() {
        return "\tI'm sorry, I didn't recognize that command. Please try again!";
    }
}
