package DAY3;

package DAY3;

@FunctionalInterface
interface Greeting {

    void sayHello(String name);
}

public class LambdaExpression {

    public static void main(String[] args) {

        Greeting g = (name) -> {
            System.out.println("Hello " + name);
        };

        g.sayHello("Muralidhar");
    }
}