/**
 * Created by anshul on 06/02/19.
 */
public class SedanCar extends Car {
    public SedanCar() {
        super(CarType.SEDAN);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building sedan car");
    }
}
