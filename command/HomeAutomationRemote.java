/**
 * Created by anshul on 08/02/19.
 */
public class HomeAutomationRemote {

    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void buttonPressed() {
        command.execute();
    }
}
