// Demonstrate the concept of Constructor Overloading in Java

class Human {
    private int age;
    private String name;

    // Default constructor
    public Human() {
        age = 12;
        name = "John Doe";
    }

    // Parameterized constructor
    public Human(int age) {
        this.age = age;
        name = "John Doe";
    }

    public Human(String name) {
        age = 12;
        this.name = name;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        Human human1 = new Human();
        Human human2 = new Human(25, "Kelvin Doe");

        System.out.println("Human 1");
        System.out.println("Age: " + human1.getAge());
        System.out.println("Name: " + human1.getName());

        System.out.println("Human 2");
        System.out.println("Age: " + human2.getAge());
        System.out.println("Name: " + human2.getName());

    }
}
