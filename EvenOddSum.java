public class EvenOddSum{
    public static void main(String []args){
        int [] a = new int[10];
        a[0] = 10;
        a[1]=12;
        a[2]=11;
        a[3]=13;
        a[4]=14;
        a[5]=15;
        a[6]=16;
        a[7]=17;
        a[8]=18;
        a[9]=19;
        int sumEven = 0;
        int sumOdd = 0;
        String numEven = "";
        String numOdd = "";
        for(int i = 0; i<a.length;i++){
            if(a[i]%2==0){
                sumEven+=a[i];
                numEven+=", "+a[i];
            }else{
                sumOdd +=a[i];
                numOdd+=", "+a[i];
            }

        }
        System.out.println("Sum of even numbers is :"+sumEven);
        System.out.println("Even numbers are :"+numEven);
        System.out.println("");
        System.out.println("Sum of Odd numbers is :"+sumOdd);
        System.out.println("Odd numbers are "+numOdd);

    }
}