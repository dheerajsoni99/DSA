public class BinarySearch {
    public static int binSearch(int arr[],int key){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]== key){
                return mid;
            }
            else if(arr[mid]<key){
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int nums[]={0,2,4,6,8,10,12,15,16,17};
      System.out.println(binSearch(nums, 1));

    }    
}
