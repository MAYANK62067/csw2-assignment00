package garbage_collection;
import java.lang.ref.*;

 class ReassigningReference {
    private String name;

    public ReassigningReference(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ReassigningReference obj1 = new ReassigningReference("Object1");
	        ReassigningReference obj2 = new ReassigningReference("Object2");

	        System.out.println("Before reassigning reference:");
	        System.out.println("obj1: " + obj1);
	        System.out.println("obj2: " + obj2);

	        obj1 = obj2;

	        System.out.println("After reassigning reference:");
	        System.out.println("obj1: " + obj1);
	        System.out.println("obj2: " + obj2);

	        System.gc();

	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	}

}}
