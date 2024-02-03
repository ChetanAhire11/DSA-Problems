import java.util.ArrayList;

public class Java6 
{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                arr2.add(i);
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]==x){
                arr2.add(i);
                break;
            }
        }
        if(arr2.size()==0)
            arr2.add(-1);
    
        return arr2;

    }
}
    
