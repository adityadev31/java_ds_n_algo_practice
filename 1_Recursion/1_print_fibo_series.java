public class Main{
    
    
    public static void fibo(int terms, int a, int b){
        
        if(terms == 0)
            return;
        
        System.out.print(a + " ");
        fibo(terms-1, b, a+b);
    }
    
    
    public static void main(String args[]){
        int n = 13;
        fibo(n, 0, 1);
    }
    
}



/***   output - 

       0 1 1 2 3 5 8 13 21 34 55 89 144
***/
