/**
 * Created by anshul on 08/02/19.
 */
public class TurnOffLightCommand implements ICommand {
    Light light;

    public TurnOffLightCommand(Light light) {
        super();
        this.light = light;
    }

    @Override
    public void execute() {
        System.out.println("Turning off light.");
        light.turnOff();
    }
}
