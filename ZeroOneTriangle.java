public class ZeroOneTriangle {
    /**
     * @param line
     */
    public static void Pattern01(int line){
        //int num = 1;
        for(int i = 0; i<=line ; i++){
            for(int j=1; j<=i; j++){

              if((i+j)%2==0){
                System.out.print(1);
              } else{
                System.out.print(0);
              }
              
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    Pattern01(6);
    }
    
}
