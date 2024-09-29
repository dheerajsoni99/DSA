

public class Transpose {
    public static int[][] transposeOf(int nums[][]){
        int newArr[][] = new int[nums[0].length][nums.length];
        for(int i =0;i<nums.length;i++){
            for(int j =0; j<nums[0].length; j++){
            newArr[j][i] = nums[i][j];
            } 
        }
        return newArr;
    }
    public static void printArray(int arr[][]){
        for (int[] arr1 : arr) {
            for (int j = 0; j<arr[0].length; j++) {
                System.out.print(arr1[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        int nums [][]={{1,2,3},
                       {4,5,6},
                    };

        printArray(nums);
        System.out.println("   ");
        
        printArray(transposeOf(nums));
    }
}
