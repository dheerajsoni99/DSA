import java.util.Scanner;
public class Average2{
    public static void main(String []args){
        try (Scanner kb = new Scanner(System.in)) {
            System.out.println("Enter three numbers A, B, and C");
            double A= kb.nextDouble();
            double B = kb.nextDouble();
            double C = kb.nextDouble();
            System.out.println("Average is :"+(A+B+C)/3);
        }
    }
}