class FindLargest{
    public static int FndLrgst(int Numbers[]){
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<Numbers.length;i++){
            if(Numbers[i]>Largest){
                Largest=Numbers[i];
            }
        }
    return Largest;
    }
    public static void main (String []args){
        int Numbers[]={3,5,6,7,3,5,9};
        int Largest=FndLrgst(Numbers);
        System.out.println("Largest is :"+Largest);
    }
}