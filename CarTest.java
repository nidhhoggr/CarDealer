import java.util.ArrayList;


public class CarTest {


	public static void main(String[] args) {
		
		Car car = new Car();
		
        setCar(car, 1);
        setCar(car, 2);
        createCar(car);
	}
	
	public static void setCar(Car car, int car_id) {
		
		car.GetById(car_id);
		
		System.out.println(car.getId());
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getCondition());
        System.out.println(car.getCommission());
        System.out.println(car.getPrice());		
	}
	
	public static void createCar(Car car) {
		
		boolean result = car.Create("Chrysler","PT Cruiser",2003,CarCondition.good, (float) 3500, (float) .1);
		System.out.print(result);
	}
	
}
