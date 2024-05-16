package assignment_1;
interface Vehicle {
    void accelerate();
    void brake();
}

class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }

    @Override
    public void brake() {
        System.out.println("Car is braking...");
    }

    public void accelerate(int speed) {
        System.out.println("Car is accelerating at a speed of " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Car is accelerating at a speed of " + speed + " km/h for " + duration + " seconds");
    }
}

class Bicycle implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Bicycle is pedaling...");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle is braking...");
    }

    public void accelerate(int speed) {
        System.out.println("Bicycle is pedaling at a speed of " + speed + " km/h");
    }

    public void accelerate(int speed, int duration) {
        System.out.println("Bicycle is pedaling at a speed of " + speed + " km/h for " + duration + " seconds");
    }
}


public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Car car = new Car();
	        Bicycle bicycle = new Bicycle();

	        car.accelerate();
	        bicycle.accelerate();
	        car.brake();
	        bicycle.brake();

	        car.accelerate(60);
	        car.accelerate(60, 10);
	        bicycle.accelerate(20);
	        bicycle.accelerate(20, 5);

	}

}
