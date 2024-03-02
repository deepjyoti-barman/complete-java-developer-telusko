// Demonstrate the use of constructor in Java

class Human {
    private int age;
    private String name;

    public Human() {
        age = 12;
        name = "John Doe";
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

public class Constructor {
    public static void main(String[] args) {

        Human human = new Human();

        System.out.println("Age: " + human.getAge());
        System.out.println("Name: " + human.getName());

    }
}
