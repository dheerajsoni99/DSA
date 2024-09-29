public class BionomialCoeff{
    public static double factorial(int i){
        int fact = 1;
        for(int j = i;j>=1;j--){
            fact = fact*j;
        }
        return fact;
    }
    public static double BNC(int n, int r){
        return(factorial(n)/((factorial(n-r)*(factorial(r)))));
    }
    public static void main (String [] args){
        
        System.out.println(BNC(10,3));

    }
}