package sorting;

import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int [] arr = {13,46,24,52,20,9};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }
    public static int [] selectionSort(int [] arr){
        for(int i = 0 ; i <= arr.length-2 ; i++){
            int mini = i ;
            for(int j = i + 1 ;j <= arr.length-1 ; j++){
                if(arr[j] < arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;
        }
        return arr;
    }
}
