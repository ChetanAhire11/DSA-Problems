class Java1{
    public String removeConsecutiveCharacter(String S){
        String res="";
        int n=S.length();
        for(int i=0;i<n;i++){
            if(i<n-1 && S.charAt(i)==S.charAt(i+1)){
            }else{
                res+=S.charAt(i);
            }
        }
        return res;
    }
}
