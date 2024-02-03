public class Java3 {
            String firstAlphabet(String S) {
            char c[] = S.toCharArray();////////////////////string convert int array
            StringBuilder sb = new StringBuilder();
            sb.append(c[0]);///////////////////print the first index
            for(int i = 0; i < S.length(); i++){
                if(c[i] == ' '){
                    sb.append(c[i+1]);
                }
            }
            return sb.toString();
        }
        
}
