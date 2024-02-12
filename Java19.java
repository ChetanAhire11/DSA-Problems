public class Java19 {
    public static void reverseArray(int originalArray[]){
          int newArray[]=new int[originalArray.length];
          for(int i=0;i<originalArray.length;i++){
            newArray[i]=originalArray[originalArray.length-i-1];
          }
          for(int a:newArray){
            System.out.print(a+" ");
          }
    }
    public static void main(String[] args) {
        int originalArray[]={1,2,3,4,5,6};
        reverseArray(originalArray);
    }
}
