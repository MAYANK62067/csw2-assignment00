package assignment3;
 class Car implements Comparable<Car> {
    private int modalNo;
    private String name;
    private int stock;

    public Car(int modalNo, String name, int stock) {
        this.modalNo = modalNo;
        this.name = name;
        this.stock = stock;
    }

    public int getModalNo() {
        return modalNo;
    }

    public void setModalNo(int modalNo) {
        this.modalNo = modalNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(this.stock, car.stock);
    }

    @Override
    public String toString() {
        return modalNo + " " + name + " " + stock;
    }
}


public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Car> cars = new ArrayList<>();

	        Car car1 = new Car(2013, "Creta", 10);
	        Car car2 = new Car(2020, "MG", 13);
	        Car car3 = new Car(2018, "Kia", 20);
	        Car car4 = new Car(2017, "Audi", 45);
	        Car car5 = new Car(2015, "BMW", 55);

	        cars.add(car1);
	        cars.add(car2);
	        cars.add(car3);
	        cars.add(car4);
	        cars.add(car5);

	        Collections.sort(cars);

	        System.out.println("Sorted list of cars:");
	        for (Car car : cars) {
	            System.out.println(car);
	        }

	}

}
