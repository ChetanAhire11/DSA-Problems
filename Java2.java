package DSA-Problems;

public class Java2 {
        public long firstIndex(long arr[], long n)
        {
            // Your code goes here
            for(int i=0;i<n;i++){
                if(arr[i]==1){
                    return i;
                }
            }
            return -1;
        }
    }

