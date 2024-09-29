public class BubbleSort{
   public static int[] BubbleSorting(int arr[]){
    for(int j =1; j<arr.length-2; j++){
    for(int i =0; i<arr.length-1; i++){
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
}
    return arr;
    }
    public static void show(int []arr){
        int i = 0; 
        while(i<arr.length){
            System.out.print(arr[i]+", ");
            i++;
        }
    }
    public static void main(String []args){
        int nums[] = {5,1,4,2,3,1,9,13,2};
        BubbleSorting(nums);
        show(nums);
    }
}