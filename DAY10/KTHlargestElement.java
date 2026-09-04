package DAY10;

public class KTHlargestElement {

    public static int findKTHlargestElement(String[] args) {
        int [] arr = {1,3,2,5,4};
        int k = 2;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k-1];
        
        
    }
    
}
