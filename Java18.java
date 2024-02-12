public class Java18 {

       static void maxMin( int arr[],int n){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max=arr[i];
            }else{
                min=arr[i];
            }

        }


     }
      public static void main(String[] args) {
        int arr[]={2,3,45,78,2,1,4};
        int n=7;
        maxMin(arr, n);
    }
    

}