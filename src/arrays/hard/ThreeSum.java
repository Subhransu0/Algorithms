package arrays.hard;

import java.lang.reflect.Array;
import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};

        List<List<Integer>> ans = optimal(arr);

        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }

    }
    public static List<List<Integer>> brute(int [] arr){
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0 ; i < arr.length ; i ++){
            for(int j = i+1 ; j < arr.length ; j ++){
                for(int k = j +1 ; k < arr.length ; k ++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> ans = Arrays.asList(arr[i] ,arr[j] ,arr[k]);
                        ans.sort(null);
                        set.add(ans);
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
    public static List<List<Integer>> better(int [] arr){
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i ++){
            HashSet<Integer> map = new HashSet<>();
            for(int j = i + 1 ; j < arr.length; j++ ){
                int k = -(arr[i] + arr[j]);
                if(map.contains(k)){
                    List<Integer> temp = Arrays.asList(arr[i] , arr[j] , k);
                    temp.sort(null);
                    set.add(temp);
                }
                map.add(arr[j]);
            }
        }
        List<List<Integer>> answer = new ArrayList<>(set);
        return answer;
    }
    public static List<List<Integer>> optimal(int [] arr){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i  < arr.length ; i++){
            if(i != 0 && arr[i] == arr[i-1]){
                continue;
            }
            int j = i+1;
            int k = arr.length -1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum > 0){
                    k--;
                }
                else if (sum < 0){
                    j++;
                }
                else{
                    List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while(j < k && arr[j]  == arr[j-1]){
                        j++;
                    }
                    while(j <k && arr[k] == arr[k+1]){
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}
