package garbage_collection;
import java.lang.ref.*;

 class AnonymousObject {
    private String name;

    public AnonymousObject(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage collected: " + name);
    }


public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousObject("AnonymousObject");

        System.gc();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

	}

}}
