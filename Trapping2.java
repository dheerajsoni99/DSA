

public class Trapping2 {
    public static int trappedRainWater(int []height){
       int leftMaxHeight = height[0];
       int rightMaxHeight=0;
       
       int trappedWater = 0;
        int maxHeightIndex = 0;

       for(int i = 0; i<height.length; i++){
        if(height[i]>rightMaxHeight){
            rightMaxHeight= height[i];
            maxHeightIndex= i;
            // System.out.println("maximum height index found :"+height[maxHeightIndex]);
        }
       }
       for(int i = 0; i<maxHeightIndex; i++){
        if(height[i]>leftMaxHeight){
            leftMaxHeight= height[i];
            
        }
       }
       for(int i = 0 ; i< maxHeightIndex; i++){
        
        int level = Math.min(leftMaxHeight,rightMaxHeight);
        trappedWater=trappedWater+(level-height[i]);
       
       }
       leftMaxHeight = rightMaxHeight;
       rightMaxHeight = height[height.length-1];
       for(int i = maxHeightIndex; i<height.length; i++){
        int level = Math.min(leftMaxHeight,rightMaxHeight);
        trappedWater+=(level-height[i]);
       }

        


        return trappedWater;
    }
    public static void main(String [] args){
        int heights [] ={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(heights));
    }
}
