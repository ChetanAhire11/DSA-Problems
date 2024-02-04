import  java.util.*;

class Java11
{
    int isPossible (String S)
    {
        // your code here
       HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
           hm.put(ch,hm.getOrDefault(ch,0)+1);
         }
         int count=0;
       for(char ch:hm.keySet()){
           if(hm.get(ch)%2!=0){
            count ++;
           }
       }
       if(count>1){
           return 0;
       }else{
           return 1;
       }
    }
}