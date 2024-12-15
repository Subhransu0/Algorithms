package arrays.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSeq {
    public static void main(String[] args) {
        int [] arr = {3,8,5,7,6};
        System.out.println(optimal(arr));

    }
    public static boolean ls(int [] arr , int x){
        for(int i  = 0 ; i < arr.length ; i++){
            if(arr[i] == x){
                return true;
            }
        }
        return false;
    }

    public static int brute(int [] arr){
        int longest = 1;
        for(int i  = 0 ; i < arr.length ; i++){
            int cnt =1 ;
            int x = arr[i];
            while(ls(arr,x+1)){
                x += 1;
                cnt += 1;
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }
    public static int better(int [] arr){
        Arrays.sort(arr);
        int longest = 1;
        int cnt =0;
        int lastSmallest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] -1 == lastSmallest){
                lastSmallest = arr[i];
                cnt += 1;
            }
            else if(arr[i] != lastSmallest){
                lastSmallest = arr[i];
                cnt =1 ;
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }

    public static int optimal(int [] arr){
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i++){
            set.add(arr[i]);
        }
        for(int it : set){
            if(!set.contains(it-1)){
                int cnt =1;
                int x = it;
                while(set.contains(x+1)){
                    x += 1;
                    cnt += 1;
                }
                longest = Math.max(longest,cnt);
            }
        }
        return longest;
    }

}
