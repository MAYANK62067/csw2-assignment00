package assignment_2;
 class Animal {
    private String name;
    private String color;
    private String type;

    public Animal(String name, String color, String type) {
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Type: " + type;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + type.hashCode();
        System.out.println("Unique ID: " + result);
        return result;
    }
}

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog = new Animal("Fido", "Brown", "Pet");
        Animal cat = new Animal("Whiskers", "Grey", "Pet");
        Animal lion = new Animal("Simba", "Golden", "Wild");

        System.out.println("Animal Objects:");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(lion);

        System.out.println("Hashcode of Animal Objects:");
        System.out.println(dog.hashCode());
        System.out.println(cat.hashCode());
        System.out.println(lion.hashCode());

	}

}
