package DAY06;

public class uncheckedexception {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            int number = Integer.parseInt("abc");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
        }
    }
}
