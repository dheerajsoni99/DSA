//Package Alpha;
import java.util.Scanner;
public class AreaOfCircle{
    public static void main(String []args){
        try (Scanner kb = new Scanner(System.in)) {
            System.out.println("Please enter the radious of the circle :");
            double rad = kb.nextDouble();
            double area = Math.PI*rad*rad;
            System.out.println("The Area of the circle is :"+area);
        }   
    }
}