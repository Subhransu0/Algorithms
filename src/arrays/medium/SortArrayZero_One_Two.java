package arrays.medium;

import java.util.Arrays;

public class SortArrayZero_One_Two {
    public static void main(String[] args) {
        int arr [] ={0,2,2,1,1,1,0,0,0,0,2,1};
        System.out.println(Arrays.toString(sortColors(arr)));

    }
    public static int [] sortColors(int[] nums) {
        int low =0;
        int mid = 0;
        int high = nums.length -1 ;
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                mid++;
                low ++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp= nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
return nums;
    }
    public static int[] sort(int [] arr){

        int cnt0 = 0 ;
        int cnt1= 0;
                int cnt2 = 0;

                for(int i = 0 ;  i < arr.length ; i ++){
                    if(arr[i] == 0){
                        cnt0 ++;
                    }
                    else if(arr[i] == 1 ){
                        cnt1 ++;
                    }else{
                        cnt2 ++;
                    }
                }

                for(int i = 0 ;  i < cnt0 ; i++){
                    arr[i] = 0 ;
                }
                for(int i = cnt0 ; i < cnt0 + cnt1 ; i++){
                    arr[i] = 1;
                }
                for(int i = cnt0 + cnt1 ; i < arr.length ; i++){
                    arr[i] = 2;
                }
        return arr;
    }
}
