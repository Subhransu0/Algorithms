package sorting;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        for(int i : arr)
        {
            System.out.print(i + "  ");
        }
    }

    public static void quickSort(int [] arr , int low , int high){
        if(low < high){
            int partitionIndex = sorting(arr,low ,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    public static int sorting(int [] arr , int low , int high ){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= pivot && i < high ){
                i++;
            }
            while(arr[j] >= pivot && j > low){
                j--;
            }
            if( i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        int temp = arr[low];
        arr[low]= arr[j];
        arr[j] = temp;


        return j;
    }
}
