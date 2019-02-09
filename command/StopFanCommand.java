/**
 * Created by anshul on 08/02/19.
 */
public class StopFanCommand implements ICommand{
    Fan fan;

    public StopFanCommand(Fan fan) {
        super();
        this.fan = fan;
    }

    @Override
    public void execute() {
        System.out.println("Stopping fan.");
        fan.stop();
    }
}
