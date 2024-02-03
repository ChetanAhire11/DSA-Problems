import java.util.Arrays;

public class Java10 
{
    int maxProduct(int arr[], int n) {
        // code here
        Arrays.sort(arr);
        return arr[n-2]*arr[n-1];
        
    }
}
