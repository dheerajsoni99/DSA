public class RotateArrayPivotEle {
    public static void rotate(int nums[], int target){
       int indexOfTarget =-1;
        for(int i =0; i<nums.length; i++){
        if(nums[i]==target){
            indexOfTarget = i;
            System.out.println("target  index is :"+i);
        }  
          
       }
    int total [] = new int[nums.length];
    int NosOfEle = 0;
      for(int i = indexOfTarget;i<nums.length;){
            //for(int j = 0; j<=NosOfEle; ){
            total[NosOfEle]=nums[i];
            i++;
           // j++;
            ++NosOfEle;
            //}
        }
        int beforeNosOfEle=0;
        for(int i = NosOfEle; i<total.length; i++){
            //for(int j=0; j<indexOfTarget; j++){
            total[i]=nums[beforeNosOfEle];
            beforeNosOfEle++;
            //}
         }
        for(int i = 0; i<total.length; i++){
            System.out.print(total[i]+", ");
         }

        System.out.println("New Array length is :"+total.length);
    }
    public static void main(String []args){
        int nums [] = {0,2,6,8,9,12};
        rotate(nums,8);
        // System.out.println(nums[2]);
    }
}
