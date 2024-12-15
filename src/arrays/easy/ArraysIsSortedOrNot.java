package arrays.easy;

public class ArraysIsSortedOrNot {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4};
        if(isSorted(arr)){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Arrays is not sorted");
        }

    }
    public static boolean isSorted(int [] arr){
        for(int i = 1 ; i <= arr.length-1 ;i ++){
            if(arr[i] < arr[i-1]){
                return false;
            }

        }
        return true;
    }
}
