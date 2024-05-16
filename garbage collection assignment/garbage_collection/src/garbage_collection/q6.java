package garbage_collection;
import java.lang.reflect.Field;
import java.util.Date;

 class MemoryIntensiveProgram {
    public static void main(String[] args) {
        int numObjects = 1000000;

        for (int i = 0; i < numObjects; i++) {
            Object obj = new Object();
        }

        printMemoryInfo();

        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                printMemoryInfo();
            }
        });

        thread.start();
    }


public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Date date = new Date();
	        System.out.println(date + " - Total memory: " + Runtime.getRuntime().totalMemory() + " bytes");
	        System.out.println(date + " - Free memory: " + Runtime.getRuntime().freeMemory() + " bytes");
	    }
	}

	}


