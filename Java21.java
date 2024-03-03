public class Java21 {
        public static int doUnion(int a[], int n, int b[], int m) 
        {
            //Your code here
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(a[i]>max){
                    max=a[i];
                }
            }
            for(int i=0;i<m;i++){
                if(b[i]>max){
                    max=b[i];
                }
            }
            
            int freq[]=new int[max+1];
            for(int i=0;i<n;i++){
                freq[a[i]]++;
            }
            for(int i=0;i<m;i++){
                freq[b[i]]++;
            }
            int count=0;
            for(int i=0;i<freq.length;i++){
                if(freq[i]>0){
                    count++;
                }
            }
            return count;
        }
    }

