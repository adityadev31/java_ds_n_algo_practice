public class Main{
    
    
    public static int fibo(int n){
        
        if(n==0 || n==1)
            return n;
        
        return fibo(n-1) + fibo(n-2);
    }
    
    
    public static void main(String args[]){
        int n = 13;
        System.out.print(n + "th fibo = " + fibo(n));
    }
    
}

/***       output -    13th fibo = 233           ***/
