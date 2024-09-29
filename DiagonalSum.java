public class DiagonalSum {
    public static int diagonalSum(int arr[][]){
        int sum1 =0;
        int sum2 = 0;
        for(int i =0; i<arr.length; i++){
            for(int j= 0; j<arr.length; j++){
                if(i==j && i+j==arr.length-1){
                    sum1+=arr[i][j];
                    break;
                }
                if(i==j){
                    sum1+=arr[i][j];
                }
                if(i+j==arr.length-1){
                    sum2+=arr[i][j];
                }
            }
        }
        System.out.println("sum 1 ="+sum1);
        System.out.println("sum 2 ="+sum2);
        return sum1+sum2;
    }
    public static void main(String []args){
        int nums [][] = new int[3][3];
        int counter =1;
        for (int[] num : nums) {
            for (int j = 0; j<nums[0].length; j++) {
                num[j] = counter;
                counter++;
            }
        }

        System.out.println("sum of diagonal is "+diagonalSum(nums));
    }
}
