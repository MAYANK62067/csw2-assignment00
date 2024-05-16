package garbage_collection;
import java.lang.ref.*;

 class UnreachableObject {
    private String name;

    public UnreachableObject(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("Creating an instance of " + name + "...");
        UnreachableObject obj = new UnreachableObject(name);
        obj.display();
    }

    public void display() {
        System.out.println("Displaying " + name + "...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnreachableObject obj = new UnreachableObject("UnreachableObject");
        obj.show();

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

	}}}


