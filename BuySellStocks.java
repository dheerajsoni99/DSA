public class BuySellStocks {
    public static int getMaxProfit(int []array){
     
    //     int buyPrice = Integer.MAX_VALUE;
    //     int sellPrice= 0;
    //     for(int i = 1; i<array.length; i++){
    //         if(array[i]>sellPrice){
    //             sellPrice = array[i];
    //         }
            
    //     }
    //     for(int i =0; i<array.length; i++){
    //         if(array[i]<buyPrice){
    //             buyPrice= array[i];
    //         }
    //     }
    // int maxProfit =sellPrice-buyPrice;
    //   return maxProfit>0?maxProfit:0;


    // Method 2 
    // method 1 runs perfectly

        int maxProfit=0;
        int buyPrice =array[0];
        for(int i = 1; i<array.length; i++){
          int profit = array[i]-buyPrice;
          if(profit<=0){
            buyPrice = array[i];

          }else{
            maxProfit = Math.max(maxProfit,profit);
          }

         
        }
        return maxProfit;
    }

    public static void main(String args[]){
        int price [] = {7,6,5,2};
      System.out.println(getMaxProfit(price));
    }
}
