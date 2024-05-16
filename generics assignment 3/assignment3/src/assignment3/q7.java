package assignment3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Address {
    private int plotNumber;
    private String apt;
    private String post;

    public Address(int plotNumber, String apt, String post) {
        this.plotNumber = plotNumber;
        this.apt = apt;
        this.post = post;
    }

    public int getPlotNumber() {
        return plotNumber;
    }

    public String getApt() {
        return apt;
    }

    public String getPost() {
        return post;
    }

    @Override
    public String toString() {
        return "Plot Number: " + plotNumber + ", Apt: " + apt + ", Post: " + post;
    }
}


public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Address> addressMap = new TreeMap<>();

        addressMap.put("John Doe", new Address(101, "Apt 101", "12345"));
        addressMap.put("Jane Smith", new Address(102, "Apt 102", "67890"));
        addressMap.put("Bob Johnson", new Address(103, "Apt 103", "34567"));

        Iterator<Map.Entry<String, Address>> iterator = addressMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Name: " + entry.getKey());
            System.out.println("Address: " + entry.getValue());
            System.out.println();

	}

}}
