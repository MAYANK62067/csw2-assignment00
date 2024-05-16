package garbage_collection;
import java.lang.reflect.Field;

 class MyClass {
    private int integer;
    private double doubleValue;

    public MyClass(int integer, double doubleValue) {
        this.integer = integer;
        this.doubleValue = doubleValue;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void updateValues(int integer, double doubleValue) {
        this.integer = integer;
        this.doubleValue = doubleValue;
    }

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass object1 = new MyClass(10, 20.5);
        MyClass object2 = new MyClass(30, 40.7);

        object1.setInteger(50);
        object2.setDoubleValue(60.9);

        object1.updateValues(70, 80.3);

        long totalMemory = Runtime.getRuntime().totalMemory();
        long freeMemory = Runtime.getRuntime().freeMemory();
        long usedMemory = totalMemory - freeMemory;

        System.out.println("Total memory: " + totalMemory + " bytes");
        System.out.println("Free memory: " + freeMemory + " bytes");
        System.out.println("Used memory: " + usedMemory + " bytes");

        object1 = null;
        object2 = null;

        usedMemory = totalMemory - Runtime.getRuntime().freeMemory();
        System.out.println("Used memory after making objects unreachable: " + usedMemory + " bytes");
    }

	}

}
