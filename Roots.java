import java.util.Scanner;
public class Roots{
    public static void main(String []args){
        try (Scanner kb = new Scanner(System.in)) {
            System.out.println("enter values of a,b, and c for ax^2+bx+c=0");
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = kb.nextInt();

            double x = ((b*b) -(4*a*c))/(2*a);
            System.out.println("Roots are "+x);
            kb.close();
        }
    }
}