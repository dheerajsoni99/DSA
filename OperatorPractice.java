public class OperatorPractice{
    public static void main(String args[]){
        // int x=y=z=2;
        // x+=y;
        // y-=z;
        // int p/=(x+y);
        // System.out.println(p);
         int x, y, z;
 x = y = z = 2;
 x += y;
 y -= z;
 z /= (x + y);
 System.out.println(x + " " + y + " " + z);
    }
}