// Demonstrate the concept of Encapsulation in Java

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    // public void setAge(int age, Human human) {
    // human.age = age;
    // }

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

public class Encapsulation {
    public static void main(String[] args) {
        Human human = new Human();

        // human.setAge(22, human);
        human.setAge(22);
        human.setName("Navin Reddy");

        System.out.println(human.getAge());
        System.out.println(human.getName());
    }
}
