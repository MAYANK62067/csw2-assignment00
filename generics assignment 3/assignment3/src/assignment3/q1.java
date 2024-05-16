package assignment3;
 class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Key: " + key + ", Value: " + value;
    }
}

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Pair<String, Integer> pair1 = new Pair<>("John", 25);
	        Pair<String, Integer> pair2 = new Pair<>("Alice", 30);

	        System.out.println("Pair 1: " + pair1);
	        System.out.println("Pair 2: " + pair2);

	        // Print the pair of key and value
	        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
	        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());

	}

}
