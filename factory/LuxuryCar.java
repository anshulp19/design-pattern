/**
 * Created by anshul on 06/02/19.
 */
public class LuxuryCar extends Car {
    public LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Building luxury car.");
    }
}
