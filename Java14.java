import java.util.Arrays;

public class Java14 
{ 
        String sort(String s) 
    {
        // code 
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        String str=new String(arr);
        return str;
    }
    
} 
    

