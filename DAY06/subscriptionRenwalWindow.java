package DAY06;

public class subscriptionRenwalWindow {
    public static int longestSubscriptionRenewalWindow(int[] subscriptionDays) {
        if (subscriptionDays.length == 0) {
            return 0;
        }

        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < subscriptionDays.length; i++) {
            if (subscriptionDays[i] > subscriptionDays[i - 1]) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }

        return Math.max(maxLength, currentLength);
    }
}
