import java.util.HashSet;

public class Java5 {
    static String removeChars(String string1, String string2){
        // code here
        HashSet <Character>HS=new HashSet<>();
        for(int i=0;i<string2.length();i++){
            HS.add(string2.charAt(i));
        }
        String ans="";
        for(int i=0;i<string1.length();i++){
            if(! HS.contains(string1.charAt(i))){
                ans=ans+string1.charAt(i);
                
            }
        }
        return ans;
    }
}
