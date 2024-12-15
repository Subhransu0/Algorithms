package arrays.easy;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,4,4,5,5,6,6,6};
        int size = removeDuplicate(arr);
        for(int i = 0 ;  i<size ; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static int removeDuplicate(int [] arr){
        int i = 0;
        for(int j = 1; j <= arr.length-1; j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
