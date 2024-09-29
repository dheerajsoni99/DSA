import java.util.Scanner;
public class GreatestOfTwo{
    public static void main(String args []){
        try (Scanner kb = new Scanner(System.in)) {
            System.out.println("enter two nos :");
            int a = kb.nextInt();
            int b = kb.nextInt();
            if(a>b){
                System.out.println(a+" is the greatest number");

            }else
            {
                System.out.println(b+" is the greatest number");
            }
        }
    }
}