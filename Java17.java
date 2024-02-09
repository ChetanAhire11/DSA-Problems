import java.util.Arrays;

public class Java17{
    
    int minProduct(int arr[], int n,int k)
    {
        // Complete the function2
        Arrays.sort(arr);
        long prod=1;
        for(int i=0;i<k;i++){
            prod=(prod*arr[i])%1000000007;
        }
         return (int)prod;
    }   
}


    
