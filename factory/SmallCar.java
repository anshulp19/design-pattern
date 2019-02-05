/**
 * Created by anshul on 06/02/19.
 */
public class SmallCar extends Car {
    public SmallCar() {
        super(CarType.SMALL);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building small car");
    }
}
