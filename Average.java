import java.util.ArrayList;
import java.util.Scanner;
public class Average{
    public static void main(String [] args){
        System.out.println("enter 25 exam scores ");
        ArrayList<Integer> score = new ArrayList<>();
        int sum = 0;
        try (Scanner kb = new Scanner(System.in)) {
            for(int i = 1; i<=25;i++){
                System.out.println(i+"th score :");
                int ith = kb.nextInt();
                score.add(ith);
                sum = sum +ith;
            }
            System.out.println("Average is "+(sum/score.size()));
        }
    }
}