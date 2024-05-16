package garbage_collection;
import java.lang.ref.*;

 class NullifiedReference {
    private String name;

    public NullifiedReference(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }
public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullifiedReference obj = new NullifiedReference("Object1");

        System.out.println("Before nullifying reference:");
        System.out.println("obj: " + obj);

        obj = null;

        System.out.println("After nullifying reference:");
        System.out.println("obj: " + obj);

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

	}

}
