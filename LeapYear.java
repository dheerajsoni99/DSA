import java.util.Scanner;
public class LeapYear{
    public static void main(String args[]){
        try ( // @SuppressWarnings("resource")
                Scanner kb = new Scanner(System.in)) {
            int year = kb.nextInt();
            if(year%400==0){
                // if(year%4==0){
                System.out.println("Leap Year !!!");
                // }else
                //     System.out.println("Not Leap Year ");
                
            }else if(year%4==0){
                System.out.println("Leap Year ");
            }else
                System.out.println("not a leap year ");
        }
    }
}