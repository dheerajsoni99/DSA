public class ReverseArray {
    public static void reverseArray(int []arr){
        // int newArr[] = new int[arr.length];
        // int start =0;
        // int end = arr.length-1;
        // for(int i = end; i>=0;i--){
        //     newArr[start]=arr[i];
        //     start++;
        // }
        // for(int i = 0; i<=newArr.length-1; i++){
        //     System.out.print(newArr[i]+", ");
        // }
   
        /* 
         * reverse array without using another array
         */
        int start = 0;
        int temp;
        for(int i = (arr.length-1); i>=0;i--){
            if(start==(arr.length)/2){
                break;
            }
            temp=arr[i];
            arr[i]=arr[start];
            arr[start]=temp;
            start++;

        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
   
    }
    public static void main(String []args){
        int nums[]= {1,2,3,4,5,6};
        reverseArray(nums);
    }
}
