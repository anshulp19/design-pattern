/**
 * Created by anshul on 08/02/19.
 */



public class HomeAutomationDemo {

    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Fan livingRoomFan = new Fan();
        Light bedRoomLight = new Light();
        Fan bedRoomFan = new Fan();

        HomeAutomationRemote remote = new HomeAutomationRemote();
        remote.setCommand(new TurnOnLightCommand(livingRoomLight));
        remote.buttonPressed();
        System.out.println();
        remote.setCommand(new TurnOffLightCommand(livingRoomLight));
        remote.buttonPressed();
        System.out.println();
        remote.setCommand(new StartFanCommand(livingRoomFan));
        remote.buttonPressed();
        System.out.println();
        remote.setCommand(new StopFanCommand(livingRoomFan));
        remote.buttonPressed();
        System.out.println();
        remote.setCommand(new TurnOnLightCommand(bedRoomLight));
        remote.buttonPressed();
    }

}
