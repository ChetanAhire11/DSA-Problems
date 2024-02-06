public class Java15 
{
    int getCount (String S, int N)
    {
         HashMap<Character,Integer>hm=new HashMap<>();
       for(int i=0;i<S.length();i++){
            if(i==S.length()-1 ||S.charAt(i)!=S.charAt(i+1)){
                hm.put(S.charAt(i),hm.getOrDefault(S.charAt(i),0)+1);
            }
       }
        int count=0;
       for(char ch:hm.keySet()){
           if(hm.get(ch)==N){
            count ++;
           }
       }
       return count;
    }
}
    

