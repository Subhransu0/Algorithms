package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class Leaders_in_Array {
    public static void main(String[] args) {

        int [] arr = {10,22,12,3,0,6};
        List<Integer> ans = optimum(arr);

        for(int i : ans){
            System.out.println(i);
        }

    }
    public static List<Integer> leaderArrays(int [] arr){
        List<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < arr.length-1 ; i ++){
            boolean leader = true;
            for(int j = i+1  ; j < arr.length ; j++){
                if(arr[i] < arr[j]){
                    leader = false;
                    break;
                }

            }
            if(leader){
                ans.add(arr[i]);
            }

        }
        ans.add(arr[arr.length-1]);
        return ans;
    }
    public static List<Integer> optimum(int [] arr){
        List<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int i = arr.length-1 ; i >= 0 ; i --){
            if(arr[i]  > maxi){
                ans.add(arr[i]);
                maxi = arr[i];
            }

        }
        return ans;
    }
}
