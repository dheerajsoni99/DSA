public class DecToBinary{
    public static void DectoBin(int BinNum){
        
        String remaindr="";
        while(BinNum>0){
            remaindr+=""+BinNum%2;
            BinNum = BinNum/2;

        }
        System.out.println(new StringBuilder().append(remaindr).reverse().toString());
    }
    public static void main(String [] args){
        int num = 10;
         DectoBin(num);

        
    }
}