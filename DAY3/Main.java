package DAY3;

interface A {
    default void show() {
        System.out.println("Class A");
    }
}

interface B extends A {
}

interface C extends A {
}

class D implements B, C {
}

public class Main {
    public static void main(String[] args) {
        D obj = new D();

        obj.show();
    }
}