/**
 * Created by anshul on 06/02/19.
 */
public class TestFactory {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
    }
}
