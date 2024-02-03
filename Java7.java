public class Java7  {
    void nextGreatest(int arr[], int n) {
        // code here
        int temp=0;
        int max=-1;
        for(int i=n-1;i>=0;i--){
            temp=arr[i];
            arr[i]=max;
            max=Math.max(max,temp);
        }
    }
}

