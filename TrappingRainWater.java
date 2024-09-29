public class TrappingRainWater{
    public static int trappedRainWater(int []arr){
        int trappedWater =0;
       int leftMaxHeight = Integer.MIN_VALUE;
       int rightMaxHeight = Integer.MIN_VALUE;

       int leftMaxHeights[] = new int[arr.length];
       int rightMaxHeights[] = new int [arr.length];
       for(int i = 0; i<arr.length; i++){
        if(arr[i]>=leftMaxHeight){
            leftMaxHeight= Math.max(arr[i],leftMaxHeight);
        }
        leftMaxHeights[i]=leftMaxHeight;
       }
       for(int i =arr.length-1; i>=0;i--){
        if(arr[i]>rightMaxHeight){
            rightMaxHeight=Math.max(arr[i],rightMaxHeight);
        }
        rightMaxHeights[i]=rightMaxHeight;
       }
       for(int i = 0; i<arr.length; i++){
        int level = Math.min(rightMaxHeights[i],leftMaxHeights[i]);
        trappedWater += level-(arr[i]);

       }
      return trappedWater;
    }



    public static void main(String [] args){
        int heights [] ={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(heights));
    }                   
}