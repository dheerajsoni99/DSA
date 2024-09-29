import java.util.Scanner;
public class GST{
    public static void main(String args[]){
        System.out.println("Enter prices of Pen, Pencil, and Rough ");
        try (Scanner kb = new Scanner(System.in)) {
            float penPrice = kb.nextFloat();
            float pencilPrice = kb.nextFloat();
            float roughPrice = kb.nextFloat();
            float total = penPrice+pencilPrice+roughPrice;
            float gst = total*18/100;
            // int $ = 49;
            System.out.println(
                    "Total price of all (inclusive of gst ) is "+(total+gst)
            );
        }
    }
}