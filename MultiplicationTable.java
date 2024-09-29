import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String []args){
        try (Scanner kb = new Scanner(System.in)) {
            System.out.println("enter a number ");
            int num = kb.nextInt();
            System.out.println("\nTable");
            for (int i = 1;i<=10;i++){
                System.out.println(num*i);
            }
        }
    }
}