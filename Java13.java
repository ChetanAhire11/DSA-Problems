class Java13
{
    public String removeConsonants(String s)
    {
        //code here
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)== 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || 
            s.charAt(i)== 'o'|| s.charAt(i) == 'u'||s.charAt(i)== 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || 
            s.charAt(i)== 'O'|| s.charAt(i) == 'U') {
                sb.append(s.charAt(i));
                
            }
        }
        if (sb.length()==0){
            return "No Vowel";
        }
           return sb.toString();
    }
    
}
