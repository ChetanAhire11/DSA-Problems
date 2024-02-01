public class Java4 {
        public long totalFine( long n, long date, long car[], long fine[])
        {
            long totalfine=0;
            if(date % 2==0){
                for(int i=0;i<n;i++){
                    if(car[i] % 2 !=0){
                        totalfine=totalfine+fine[i];
                    }
                }
            }
            else{
                for(int i=0;i<n;i++){
                    if(car[i] %2 ==0){
                        totalfine=totalfine+fine[i];
                    }
                }
                
            }
            return totalfine;
        }
    }

