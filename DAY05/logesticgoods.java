package DAY05;

public class logesticgoods {

    public static int shipthisday(int[] weights, int days) {
        int left = 1;
        int right = 0;
        for (int weight : weights) {
            right += weight;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canShip(weights, days, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args  ){
        int[] nums = {2,3,4,5,6,7,8,9};
        int days = 5;
        System.out.println(shipthisday(nums, days));
        
        int answer = right;
        while ()SN
    }

}
