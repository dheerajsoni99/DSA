public class Q1{
    public static boolean repeatChecker(int num[]){
        for(int i =0; i<num.length; i++){
            for(int j =i+1;j<num.length; j++){
           if(num[j]==num[i]){
            return true;
           }
        }
        }
        return false;
    }
    public static void main(String []args){
        int num [] ={1,2,3,4,5,6,9,9};
        System.out.println(repeatChecker(num));
    }
}