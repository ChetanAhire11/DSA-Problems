public class Java12
{ 
    String merge(String S1, String S2)
    { 
        int i=0,j=0;
        int len1 = S1.length();
        int len2 = S2.length();
        String temp = "";
        while(i<len1 && j<len2)
        {
            temp+=S1.charAt(i++);
            temp+=S2.charAt(j++);
        }
        while(i<len1)
        {
           temp+=S1.charAt(i++);
        }
        
        while(j<len2)
        {
           temp+=S2.charAt(j++);
        }
        
        return temp;
    }
} 
    

