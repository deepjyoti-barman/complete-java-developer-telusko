// Demonstrate the use of array of objects

class Student {

    int rollNo;
    String name;
    int marks;
}

public class ArrayOfObjects {

    public static void main(String[] args) {

        int numbers[] = new int[6];
        System.out.println("numbers = " + numbers);
        // numbers[6] = 10; // ArrayIndexOutOfBoundsException

        Student student1 = new Student();
        student1.rollNo = 1;
        student1.name = "Navin";
        student1.marks = 88;

        Student student2 = new Student();
        student2.rollNo = 2;
        student2.name = "Harsh";
        student2.marks = 67;

        Student student3 = new Student();
        student3.rollNo = 3;
        student3.name = "Kiran";
        student3.marks = 93;

        // We are creating an array which can store 3 references of type Student
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        // Printing the value of properties of each Student object
        System.out.println(" --- Printing using for loop --- ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].rollNo + " " + students[i].name + " " + students[i].marks);
        }

        // Printing the value of properties of each Student object
        System.out.println(" --- Printing using enhanced for loop --- ");
        for (Student stud : students) {
            System.out.println(stud.rollNo + " " + stud.name + " " + stud.marks);
        }
    }
}
