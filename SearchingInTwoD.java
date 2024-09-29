public class SearchingInTwoD {
// The array is sorted in both row wise and column wise
    public static void stairCaseSearch(int arr[][], int key){
        int row =0, col = arr[0].length-1;
        while(row<= arr.length | col >= 0){
            if(key == arr[row][col]){
                System.out.println( " key found at "+row + " "+col);
                return;

            }
            else if(key >arr[row][col]){
                row++;
            }
            else if(key<arr[row][col]){
                col--;
            }

        }
    }
    public static void main(String []args){
        int nums [][] = {{10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}};

        int key = 33;
        stairCaseSearch(nums, key);
    }
}
