package sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int arr[] = {2,6,1,6,3,9,1};
        System.out.println(Arrays.toString(insertionSort(arr)));

    }
    public static int [] insertionSort(int [] arr){
        for(int i = 0 ; i <= arr.length-1 ; i++){
            int j = i;
            while (j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
    }
}
