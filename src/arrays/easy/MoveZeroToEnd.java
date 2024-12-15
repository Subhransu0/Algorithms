package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int [] arr ={1,0,2,3,2,0,0,4,5,1,0,0};
        System.out.println(Arrays.toString(moveZeroOptimal(arr)));

    }
    public static int[] moveZeroOptimal(int [] arr){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j+1; i < arr.length ; i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return arr;
    }

    public static int [] moveZero(int [] arr){

        List<Integer> temp = new ArrayList<>();

        for(int i = 0 ; i<= arr.length-1; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }
        int size = temp.size();
        for(int i = 0 ; i < size ; i ++){
            arr[i] = temp.get(arr[i]);
        }
        for(int i = size ; i < arr.length ; i++){
            arr[i] = 0;
        }

        return arr;
    }
}
