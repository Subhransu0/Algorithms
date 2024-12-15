package arrays.easy;

import java.util.HashMap;

public class LongestSubArray {
    public static void main(String[] args) {
        int [] arr = {-59 ,-25, 58, -59, -25 ,58,
                };
        System.out.println(optimumSolutionOfLongestSubArray(arr,-85));

    }

    public static int optimumSolutionOfLongestSubArray(int arr [] , int k){
        int left = 0;
        int right = 0 ;
        int sum = arr[0];
        int length = 0;

        while(right < arr.length){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                length = Math.max(length,right - left +1);
            }

            right++;
            if(right < arr.length) sum += arr[right];
        }

        return length;
    }
    public static int hashingMethod(int [] arr , int k){
        int length =0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i< arr.length ; i++)
        {
            sum += arr[i];
            if(sum == k){
                length = Math.max(length,i+1);
            }
            int temp = sum - k;
            if(map.containsKey(temp)){
                int len = i - map.get(temp);
                length = Math.max(length,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }

        }
        return length;
    }

    public  static int optimisedBrute(int [] arr , int k){
        int length = 0;
        for(int i = 0 ; i < arr.length ; i ++){
            int sum = 0 ;
            for(int j = i ; j < arr.length ; j ++){
                sum = sum + arr[j];
                if(k == sum) length = Math.max(length,j-i+1);
            }
        }
        return length;
    }
    public static int longestSubArraySum(int [] arr , int k)
    {
        int length = 0;
        for(int i = 0 ; i< arr.length ; i ++){
            for(int j = i ; j < arr.length; j++){
                int sum = 0 ;
                for(int m = i ; m <= j ; m++){
                    sum += arr[m];
                }
                if(sum == k) length = Math.max(length, j-i+1);
            }
        }
        return length;

    }

}
