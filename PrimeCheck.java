import java.util.Scanner;
public class PrimeCheck{
    public static void main(String args[]){
        try (Scanner kb = new Scanner (System.in)) {
            System.out.println("enter a number to check for prime. ");
            int num = kb.nextInt();
            // for(int i= 2; i< num; i++){
            //     if(num%i==0){
            //         System.out.println("Not a prime number.");
            //         return;
            //     }else{
            //         System.out.println("Prime numeber.");
            //         return;
            //     }
            // }
            
            
            // // boolean method for checking prime  or not
            boolean isPrime = true;
            // for(int i = 2; i<num;i++){
            //     if(num%i==0){
            //         isPrime = false;
            //        // return;
            //     }
            // }
            // System.out.println(num+" is prime :"+isPrime);
            
            
            // Optimised way to check the prime or not
            for(int i = 2; i<=Math.sqrt(num);i++){
                if(num%i == 0){
                    isPrime = false;
                }
            }
            System.out.println(num +" is prime "+isPrime);
        }
    }
}