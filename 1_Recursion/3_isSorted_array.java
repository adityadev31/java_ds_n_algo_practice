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




/**

    2nd way -------given an array - find whether the array is sorted or not



public class Main{
    
    
    public static boolean isSorted(int arr[], int startIndex){
        if(startIndex>=arr.length-1)
            return true;
            
        if(arr[startIndex]>arr[startIndex+1])
            return false;
        boolean small = isSorted(arr, startIndex+1);
        return small;
    }
    
    
    public static void main(String args[]){
        int arr[] = {2,3,4,6,8,13,100};
        System.out.print(isSorted(arr, 0));    // arr.length = 7
    }
    
}


    OUTPUT -    true



**/
