import java.util.Scanner;
public class Factorial{
public static void main(String []args)
{
    try (Scanner kb = new Scanner(System.in)) {
        System.out.println("enter a number to calculate its factorial :");
        int d = kb.nextInt();
        double factorial =1;
        for(double i = d; i>0;i--){
            factorial*=i;
        }
        System.out.println("\nFactorial is "+factorial);
    }
}
}