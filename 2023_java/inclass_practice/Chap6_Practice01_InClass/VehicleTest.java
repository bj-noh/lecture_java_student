package Chap6_Practice01_InClass;

public class VehicleTest {
	
    public static void printInfo(Vehicle vehicleObject) {
    	
        if (vehicleObject instanceof Car) {
        	if (vehicleObject instanceof Autonomous) {
                Autonomous autonomous = (Autonomous) vehicleObject;
                System.out.println("Autonomous Information");
                autonomous.printInfo();
        	}
        	else {
	            Car car = (Car) vehicleObject;
	            System.out.println("Car Information");
	            car.printInfo();
        	}
            
        } else if (vehicleObject instanceof Tank) {
            Tank tank = (Tank) vehicleObject;
            System.out.println("Tank Information");
            tank.printInfo();
            
        } else if (vehicleObject instanceof Airplane) {
            Airplane airplane = (Airplane) vehicleObject;
            System.out.println("Airplane Information");
            airplane.printInfo();
                        
        } else {
            System.out.println("Vehicle Information");
            vehicleObject.printInfo();
        }
        System.out.println("-----------------------");
    }
    
    public static void main(String[] args) {
        // Create instances of Vehicle, Car, Tank, Airplane, and Autonomous
        Vehicle vehicle = new Vehicle();
        Car car = new Car("Car Manufacturer", "Car Model");
        Tank tank = new Tank("Tank Manufacturer", "Tank Model");
        Airplane airplane = new Airplane("Airplane Manufacturer", "Airplane Model");
        Autonomous autonomous = new Autonomous("Autonomous Manufacturer", "Autonomous Model");

        // Test Vehicle methods
        vehicle.startEngine();
        vehicle.move();
        vehicle.stopEngine();

        // Test Car methods
        car.setNumWheels(4);
        car.drive();
        car.park();
        car.startEngine();
        car.move();
        car.stopEngine();

        // Test Tank methods
        tank.setCannonSize("Large");
        tank.fireCannon();
        tank.move();
        tank.startEngine();
        tank.move();
        tank.stopEngine();

        // Test Airplane methods
        airplane.setWingspan(35.5);
        airplane.takeOff();
        airplane.land();
        airplane.startEngine();
        airplane.move();
        airplane.stopEngine();

        // Test Autonomous methods
        autonomous.autoPilot();
        autonomous.setNumWheels(4);
        autonomous.drive();
        autonomous.park();
        autonomous.startEngine();
        autonomous.move();
        autonomous.stopEngine();
        
        // Test printInfo() method for each object
        printInfo(vehicle);
        printInfo(car);
        printInfo(tank);
        printInfo(airplane);
        printInfo(autonomous);
    }
}
