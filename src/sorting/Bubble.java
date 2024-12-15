package sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int arr [] = {13,46,24,52,20,9};
        System.out.println(Arrays.toString(bubbleSort(arr)));

    }
    public static int[] bubbleSort(int [] arr){
        for(int i = arr.length - 1 ; i > 0 ; i --){
            for(int j = 0 ; j <= i - 1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
