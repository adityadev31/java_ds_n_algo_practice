/**

    given an array - find whether the array is sorted or not

***/



public class Main{
    
    
    public static boolean isSorted(int arr[], int index){
        if(index<=0)
            return true;
            
        boolean small = isSorted(arr, index-1);
        if(small==false)
            return false;
        else if(arr[index]>=arr[index-1])
            return true;
        return false;
    }
    
    
    public static void main(String args[]){
        int arr[] = {3,3,4,6,8,13,100};
        System.out.print(isSorted(arr, arr.length-1));    // arr.length = 7
    }
    
}


/**

    OUTPUT -    true

**/
