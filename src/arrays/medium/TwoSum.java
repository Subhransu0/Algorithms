package arrays.medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr [] = {2,6,5,8,11};
        System.out.println(Arrays.toString(betterApproach(arr,14)));
    }
    public static int[] twoSumBrute(int [] arr , int target){
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i+1;j < arr.length; j ++){
         if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int [] {-1};
    }
    public static int[] betterApproach(int [] arr , int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans [] = new int[2];
        for(int i = 0 ; i < arr.length ; i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                ans[0] = map.get(rem);
                ans[1] = i;
            }
            map.put(arr[i] , i);
        }
        return ans;
    }
}
