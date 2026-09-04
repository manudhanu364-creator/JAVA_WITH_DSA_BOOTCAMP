package DAY08;

public class Memoization {
      
    static int climb(int n , int[] dp) {
        if (n <= 1) {
            return 1;
        }
        if (dp[n] != 0) {
            return dp[n];
        }
        dp[n] = climb(n - 1, dp) + climb(n - 2, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n + 1];
        System.out.println(climb(n, dp));
        
    }
    
}
