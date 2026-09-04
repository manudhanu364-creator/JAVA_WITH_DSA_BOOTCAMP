package DAY01;

public class Minnumberofnotes {
    public static void main(String[]args) {
        int N = 242;
        int c100 = N / 100; //Division
        N = N % 100;

        int c50 = N / 50;
        N = N % 50;

        int c20 = N / 20;
        N = N % 20;

        int c10 = N / 10;
        N = N % 10;
        
        int c5 = N / 5;
        N = N % 5;

        int c2 = N / 2;
        N = N % 2;

        int c1 = N;
        System.out.println("total number of notes ="+(c100+c10+c50+c20+c1+c2+c5));
    }




        



        
        
    }
    

