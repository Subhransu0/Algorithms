package sorting;

import java.util.ArrayList;
import java.util.List;

public class Merge {
    public static void main(String[] args) {
        int arr[] = {8,3,1,9,5,7,10,3};
        mergeSort(arr,0,arr.length-1);

        for(int i : arr){
            System.out.print(i + " , ");
        }

    }
    public static void mergeSort(int [] arr , int low , int high){
        if(low == high) return;
        int mid = (low + high) /2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        mergee(arr,low,mid,high);
    }

    public static int [] mergee(int [] arr , int low , int mid , int high){
        List<Integer> temp = new ArrayList<>();
        int left = low ;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }

        for(int i = low ; i <= high ; i ++){
            arr[i] = temp.get(i - low);
        }
        return arr;
    }

}
