
public class BinToDec{
    public static String BinTodec(int BinNum){
        int pow = 0;
        int decValue = 0;
        while(BinNum>0){
            int lastDigit = BinNum%10;
            decValue += lastDigit*(int)Math.pow(2,pow);
            pow ++;
            BinNum = BinNum/10;
        }
        return "Decimal number is :"+decValue;
    }
    public static void main(String []args){
        int num = 1010;
        System.out.println(num + "'s "+BinTodec(num));
        
    }
}