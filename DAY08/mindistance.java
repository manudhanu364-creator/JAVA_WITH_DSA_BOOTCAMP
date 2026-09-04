package DAY08;

public class mindistance {

    public static int deleteoperation(String s1, String s2, int m1, int n1) {
     int m1=s1.length();
     int n1=s2.length();
     int dp[][] = new int [n1+1][m1+1];
     for (int j = 1; j <= m1; j++) {
         dp[0][j] = j;
     }
     for (int j = 1; j <= n1; j++) {
         dp[j][0] = j;
     }
     for (int i = 1; i <= n1; i++) {
         for (int k = 1; k <= m1; k++) {
             if (s2.charAt(i - 1) == s1.charAt(k - 1)) {
                 dp[i][k] = dp[i - 1][k - 1];
             } else {
                 dp[i][k] = 1 + Math.min(dp[i - 1][k], dp[i][k - 1]);
             }
         }
     }
     return dp[n1][m1];
    }
    public static void main(String[] args) {
    }
    
}
