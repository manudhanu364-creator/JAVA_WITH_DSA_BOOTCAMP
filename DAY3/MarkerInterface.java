package DAY3;
package DAY3;

interface Printable {
    
}

class Student implements Printable {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class MarkerInterface {

    public static void main(String[] args) {

        Student s = new Student("Muralidhar", 20);

        s.display();

        if (s instanceof Printable) {
            System.out.println("Student is Printable");
        }
    }
}