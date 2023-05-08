package Chap7_Example02;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vehicle myVehicle = new Vehicle("Honda", "Civic", 2022);
        myVehicle.start(); // Outputs "The vehicle starts."

        Car myCar = new Car("Toyota", "Corolla", 2022);
        myCar.start(); // Outputs "The car starts."

        Truck myTruck = new Truck("Ford", "F-150", 2022);
        myTruck.start(); // Outputs "The truck starts."
    }
}
