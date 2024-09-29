public class PrimeInRange{
    public static boolean isPrime(int num){
        boolean is=true;
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                is= false;
            }
                
              
        }
        return is;
        
    }
    public static void main(String []args){
        int start =10;
        int end=100;
        for(int i = start ; i<= end ;i++){
            if(isPrime(i)){
                System.out.print(i+", ");
               
            }
        }

        
    }
}