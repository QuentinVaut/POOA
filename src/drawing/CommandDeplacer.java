package drawing;

/**
 * Created by Quentin on 03/01/2017.
 */
public class CommandDeplacer implements Command {
    private Drawing drawing;

    public CommandDeplacer(Drawing drawing) {
        this.drawing = drawing;
    }

    @Override
    public void execute() {


    }

    @Override
    public void unexecute() {

    }
}
