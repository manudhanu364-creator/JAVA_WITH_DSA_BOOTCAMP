package DAY05;

public class Candygame {
    public static int Candy(int[] rating){  
        if (rating.length == 0) {
            return 0;
        } 
    } 

    for (int i = rating .length - 2; i >= 0; i--) {
        if (rating[i] > rating[i + 1]) {
            rating[i] = rating[i + 1] + 1;
        }
    }
    
}

for (int i = 1; i < rating.length; i++) {
    if (rating[i] > rating[i - 1]) {
        rating[i] = rating[i - 1] + 1;
    }
}
