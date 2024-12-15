package arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class MaxiSubArrayPrintALLIndex {
    public static void main(String[] args) {
        int arr [] = {-2,1,-3,4,-1,2,1,-5,4};
        List<Integer> ans = kadanes(arr);
        for (int i : ans){
            System.out.print(i + " ");
        }

    }
    public static List<Integer> kadanes(int []arr){
        List<Integer> ans = new ArrayList<>();
        int sum = 0;
        int maxi = arr[0];
        int start = 0;
        int ansStart = 0;
        int ansEnd = 0;
        for(int i = 0; i < arr.length ; i ++){
            if(sum == 0) start = i;

            sum += arr[i];

            if(sum > maxi){
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }

        for(int i = ansStart ; i <= ansEnd ; i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}
