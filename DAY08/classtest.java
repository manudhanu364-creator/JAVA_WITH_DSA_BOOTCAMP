package DAY08;

public class classtest {

    public static void deleteoperation( String S1, String S2, int n1, int m1){
        int n1 = S1.length();
        int m1 = S2.length();
        int[][] dp = new int[m+1] [n+1];
        for  (int j =1, j<m+1, j++ ){
          dp [0][j] = j;
        }
    }
      for (int j = 1, j<n+1, j++){
        dp [0][j] = j;
      }

    public static void main(String [] args){

    }


}
