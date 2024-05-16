package assignment_2;
 class Car implements Comparable<Car> {
    private String model;
    private String color;
    private double speed;

    public Car(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Speed: " + speed;
    }

    @Override
    public int compareTo(Car other) {
        return Double.compare(other.speed, this.speed);
    }
}

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Toyota", "Red", 120.0);
        Car car2 = new Car("Honda", "Blue", 150.0);

        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);

        if (car1.compareTo(car2) > 0) {
            System.out.println("Car 1 has a greater speed than Car 2.");
        } else if (car1.compareTo(car2) < 0) {
            System.out.println("Car 2 has a greater speed than Car 1.");
        } else {
            System.out.println("Both cars have the same speed.");
        }

	}

}
