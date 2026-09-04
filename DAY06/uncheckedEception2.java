package DAY06;

public class uncheckedEception2 {
    public static void main(String[] args){
        try{
            int number = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        }
    }
    
}
