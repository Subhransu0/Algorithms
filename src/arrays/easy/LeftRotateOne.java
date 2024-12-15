package arrays.easy;

import java.util.Arrays;

public class LeftRotateOne {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotate(arr)));

    }
    public static int[] rotate(int [] arr){
        int temp = arr[0];
        for(int i = 1 ; i < arr.length ;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1]= temp;
        return arr;
    }
}
