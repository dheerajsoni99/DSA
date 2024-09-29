import java.util.Scanner;
public class SquareArea{
    public static void main(String []args){
        double side;
        try (Scanner kb = new Scanner(System.in)) {
            System.out.println("enter the side of the Square ");
            side = kb.nextDouble();
        }
        System.out.println("Area of the Square is "+side*side);
    }
}