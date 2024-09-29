public class Patterns{
    public static void hollowRhombus(int line){
       //completed
        for(int i = 1; i<= line ; i++){
            if(i == 1){
                for(int j = line -1; j>= i; j--){
                    System.out.print(" ");
                }
                for(int  k = 1; k<= line; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else if(i == line){
                for(int  j = 1; j<= line; j++){
                    System.out.print("*");
                } 
                for(int j = line -1; j>= i; j--){
                    System.out.print(" ");
                } 
                System.out.println();
            }
            else{
                for(int j = line -1; j>= i; j--){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j = 1; j<= 3; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                for(int j = line-1;j>=1; j--){
                    System.out.print(" ");
                }
                System.out.println();

            }
        }
    }
    /**
     * @param line
     * this code can be used to make butterfly pattern of stars in any objects or c
     * can be accessed directly by the class name and dot operator. 
     * thanks 
     */
    public static void solidRhombus(int line){
        for(int i = 1; i<= line ; i++){
            for(int j = line-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int j = 1; j<= 5; j++){
                System.out.print("*");
            }
            for(int j = i; j>=line -i; j--){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void ButterFly(int line){
        
        for(int i = 1; i<=line; i++){
            for(int j = 1; j<=i; j++){
               System.out.print("*");
               
            }
            for(int k = 1; k<=2*(line-i); k++){
               System.out.print(" ");
               
            }
            for(int j = 1; j<=i; j++){
               System.out.print("*");
               
            }
            System.out.println();  
        }
        for(int i = line; i>=1; i--){
         for(int j = 1; j<=i; j++){
            System.out.print("*");
            
         }
         for(int k = 1; k<=2*(line-i); k++){
            System.out.print(" ");
            
         }
         for(int j = 1; j<=i; j++){
            System.out.print("*");
            
         }
         System.out.println();  
        }
    }

        public static void inverted_Pyramid(int i){
            for(int j = 1; j<=i; j++){
                for(int k = 1; k<=i-j; k++){
                     System.out.print(" ");
                //    for(int n = k ; n>= 0; n--){
                //     System.out.print(" ");
                //    }
                }
                for(int p = 1; p<=j; p++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void inverted_Pyramid_with_Num(int n){
            for (int i=n; i>= 1; i-- ){
                for(int j = 1; j<=i; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        public static void floyd(int line){
            int counter = 1;
            for(int i=1;i<=line;i++){
                for(int j=i; j>=1; j--){
                    System.out.print(counter+" ");
                    counter ++;
                }
                System.out.println();
            }
        }

    public static void main(String []args){
       // floyd(5);
        // inverted_Pyramid_with_Num(5);  
 
        //inverted_Pyramid(5);
      //  ButterFly(8);
     // solidRhombus(5);
        hollowRhombus(5);
    }
}