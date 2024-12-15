package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class AppearOnce {
    public static void main(String[] args) {
        int arr [] = {1,1,2,2,3,4,4,5,5};
        System.out.println(betterSolution(arr));

    }
    public static int betterSolution(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i<arr.length; i++){
            int value = map.getOrDefault(arr[i] , 0);
            map.put(arr[i] , value+1);
        }
        for(Map.Entry<Integer,Integer> it : map.entrySet()){
            if(it.getValue() == 1){
                return it.getKey();
            }
        }
        return  -1;
    }
    public static int appearOnce(int [] arr){
        for(int i = 0 ; i < arr.length ; i ++){
            int temp = arr[i];
            int cnt = 0;
            for(int j = 0 ; j < arr.length; j++){
                if(arr[j] == temp){
                    cnt++;
                }
            }
            if(cnt == 1) return temp;
        }
        return -1;
    }

    public static int hashMethod(int [] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i] > maxi){
                maxi = arr[i];
            }
        }
        int hash [] = new int[maxi];
        for(int i = 0 ;  i < hash.length ; i ++){
            hash[arr[i]] ++;

        }
        for(int j = 0 ; j < hash.length ; j++){
            if(hash[arr[j]] == 1){
                return arr[j];
            }
        }
        return -1;
    }
}
