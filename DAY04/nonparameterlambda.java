package DAY04;

interface Greet {
    void display();
}

public class nonparameterlambda {
    public static void main(String[] args) {
        Greet g = () -> System.out.println("Hello, World!");
        g.sayhello();
    }

}  


