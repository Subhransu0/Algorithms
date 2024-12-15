package arrays.easy;

import java.util.Arrays;

public class LeftRotateDtimes {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(leftRotate(arr,4)));

    }
    public static int[] leftRotate(int [] arr , int d){
        d = d % arr.length;
        int [] temp = new int[d];
        for(int i = 0 ; i < temp.length ; i++){
            temp[i] = arr[i];
        }
        for(int i = d ; i < arr.length ; i++ ){
            arr[i - d] = arr[i];
        }
        for(int i = arr.length-d; i < arr.length ;i++){
            arr[i] = temp[i - (arr.length-d)];
        }
        return arr;
    }
}
