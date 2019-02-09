/**
 * Created by anshul on 08/02/19.
 */
public class TurnOnLightCommand implements ICommand {
    Light light;

    public TurnOnLightCommand(Light light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning on light.");
        light.turnOn();
    }
}
