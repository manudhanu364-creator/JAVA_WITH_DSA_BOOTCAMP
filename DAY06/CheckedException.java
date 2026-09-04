package DAY06; 

public class CheckedException {

    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (Exception e) { 
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }

}
