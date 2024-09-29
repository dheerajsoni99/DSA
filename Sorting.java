/// to sort an array 
/// { 5, 4,1,3,2}
import java.util.Arrays;

public class Sorting{
    public static void BubbleSort(int arr[]){
        for(int i = 0; i<arr.length-1;i++){
            
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]= temp;
                    
                }
            }
        }

    }
    public static void show(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
    }
    public static void main(String args[]){
        int num[] = {5, 4, 1, 3, 2};
        Arrays.sort(num);    
        //BubbleSort(num);
        show(num);
    }
}