import java.util.ArrayList;
import java.util.Collections;

public class Java9
{
    
    public void sortIt(long arr[], long n)
    {
      ArrayList<Long> odd = new ArrayList<>();
       ArrayList<Long> even = new ArrayList<>();
       for(int i=0;i<n;i++){
           if(arr[i]%2!=0){
               odd.add(arr[i]);
           }else{
               even.add(arr[i]);
           }
       }
       Collections.sort(odd,Collections.reverseOrder());
       Collections.sort(even);
       int index=0;
       for(long a:odd){
           arr[index++]=a;
       }
       for(long b:even){
           arr[index++]=b;
       }
       
    }
}
    

