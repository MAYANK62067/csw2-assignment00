package assignment_1;
 class Laptop {
    private String model;
    private double price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Price: " + price;
    }
}

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Laptop laptop = new Laptop();
	        laptop.setModel("Dell Inspiron");
	        System.out.println(laptop);
	    }
	

	}


