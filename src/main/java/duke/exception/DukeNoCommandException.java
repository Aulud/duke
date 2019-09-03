package duke.exception;

@SuppressWarnings("serial")
public class DukeNoCommandException extends DukeException {
    public DukeNoCommandException() {
        super("No command issued", "");
    }

    @Override
    public String toString() {
        String template = "[DukeNoCommandException]\n%s";
        return String.format(template, this.getMessage()); 
    }
}
