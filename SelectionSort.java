public class SelectionSort {
    public static int[] selectionSort(int []arr){

        int minIndex = -1;
        for(int i =0;i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j =arr.length-1;j>=0;j-- ){
                if(arr[j]<min){ 
                     min = arr[j];

                }
                if(arr[j]==min){
                    minIndex = j;
                }
            }
            
            arr[minIndex]=arr[i];
            arr[i] = min;

        }
        return arr;
    }
    public static void show(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    

    public static void main(String []args){
        int nums[] = {5,1,4,8,3};
        selectionSort(nums);
        show(nums);
    }
}
