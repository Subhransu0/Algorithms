package arrays.medium;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {

        int [] arr = {1,2,3};
        System.out.println(Arrays.toString(permutattionArray(arr)));

    }
    public static int[] permutattionArray(int [] arr){
        int index = -1;

        for(int i = arr.length-2; i >= 0 ; i--){
            if(arr[i]<arr[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(arr,0,arr.length-1);
            return arr;
        }
        for(int i = arr.length-1; i >= index+1 ; i --){
            if(arr[i] > arr[index]){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        reverse(arr, index+1 , arr.length-1);

        return arr;

    }
    public static void reverse(int [] arr , int s , int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
