

public class SubArray {
    
public static void printSubArray(int arr[]){
    for(int i = 0; i<arr.length; i++){
        System.out.print("(");
        for(int j = i; j<arr.length; j++){
            System.out.print(arr[j]+",");
        }
        System.out.print(")");
        System.out.println();
    }
}
public static void subArraySum(int []arr){
   
    for(int i = 0; i<arr.length; i++){
        int sum=0;
        System.out.print("(");
        for(int j = i; j<arr.length; j++){
            System.out.print(arr[j]+",");
            sum +=arr[j];

        }

        System.out.print(")");
        System.out.println("   sum is "+sum);
        System.out.println();
        
    }   
}
public static int maxSubArraySum(int []arr){
    int sum[] =new int [arr.length];
    for(int i = 0; i<arr.length; i++){
        
        System.out.print("(");
        for(int j = i; j<arr.length; j++){
            System.out.print(arr[j]+",");
            sum[i] +=arr[j];

        }

        System.out.print(")");
        System.out.println();
        
        
    }
    int max = Integer.MIN_VALUE;
    for(int i = 0; i<sum.length; i++){
        if(sum[i]>max){
            max = sum[i];
        }
    }
    return max;

}
public static void main(String [] args){
    int nums [] = {1,2,3,4,5,6};
  System.out.println("max subArray sum is "+maxSubArraySum(nums));
}


}
