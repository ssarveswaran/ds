public class recursion {
    public static void main(String args[]){
        //System.out.println(fact(5));
        int fact=1;
        for(int i=1;i<=3;i++){
            fact=fact*i;
        }
        System.out.println(fact);//iteration
        System.out.println(fact(5));
    }
    private static int fact(int i){
        if(i<1) return 1;//base value
        return i*fact(i-1);//recursion  process
    }
    
}
