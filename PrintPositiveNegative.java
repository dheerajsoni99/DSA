import java.util.Scanner;
public class PrintPositiveNegative{
    public static void main(String args[]){
        try (Scanner kb = new Scanner(System.in)) {
            System.out.println("Enter a number to check whether it is positive or negative :");
            int in = kb.nextInt();
            if(in>0){
                System.out.println("Positve");
                
            }else if(in<0){
                System.out.println("Negative");
            }else
            {
                System.out.println("Zero");
            }
        }
    }
}