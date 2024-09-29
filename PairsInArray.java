public class PairsInArray {
public static void pairsInArray(int []arr){
    for(int i = 0; i<=arr.length;i++){
        for(int j = i+1; j<arr.length;j++){
            System.out.print("("+arr[i]+", "+arr[j]+")");
        }
    }
} 
public static void main(String []args){
    int nums[] = {1,2,4,5,6};
    pairsInArray(nums);

}   


}
