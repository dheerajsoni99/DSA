

public class SpiralMetrix{
    public static void printSpiral(int matrix[][]){
        int startRow =0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol <=endCol){
            
            // to print top

            for(int i = startCol; i<=endCol; i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            // to print right
            for(int i = startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // to print bottom 
            for(int i = endCol-1; i>=startCol; i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            // to print left
            for(int i = endRow-1; i>startRow; i--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;

        }
    }
    public static void main(String []args){
        int spiral [][] = new int[4][4];
        int counter =1;
        for (int[] spiral1 : spiral) {
            for (int j = 0; j<spiral[0].length; j++) {
                spiral1[j] = counter;
                counter++;
            }
        }
        printSpiral(spiral);
     
        
    }
}