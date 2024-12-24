package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArray {
    public static void merge(int [] arr1 , int [] arr2){
        List<Integer> temp = new ArrayList<>();
        int i = 0 ;
        int j = 0 ;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                temp.add(arr1[i]);
                i++;
            }else{
                temp.add(arr2[j]);
                j++;
            }
        }
        while(i < arr1.length){
            temp.add(arr1[i]);
            i++;
        }
        while(j < arr2.length){
            temp.add(arr2[j]);
            j++;
        }


        for(int k = 0 ; k  < arr1.length ; k ++){
            arr1[k] = temp.get(k);
        }
        for(int k = 0 ; k < arr2.length ;  k++){
            arr2[k] = temp.get(arr1.length+k);
        }
    }

    public static void Optimal(int arr1 [] , int [] arr2){
        int left = arr1.length -1;
        int right = 0 ;
        while(left >= 0 && right < arr2.length){
            if(arr1[left] > arr2[right]){
                int temp =  arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }else{
                break;
            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int arr1 [] = {1,2,3,5,7};
        int arr2[] = {0,2,4,6,8};
        merge(arr1,arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
