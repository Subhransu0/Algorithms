package arrays.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Nby3times {
    public static void main(String[] args) {
        int [] arr = {1,1,1,3,3,2,2,2};
        List<Integer> ans = optimal(arr);
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
    public static List<Integer> brute(int [] arr){
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < arr.length ; i++){

            if(ans.size() == 0 || arr[i] != ans.get(ans.size()-1) ){
                int cnt  =0 ;
                for(int j = 0 ; j < arr.length ; j++){
                    if(arr[i] == arr[j]){
                        cnt++;
                    }

                }
                if(cnt > arr.length/3){
                    if(ans.size() == 0 || arr[i] != ans.get(ans.size()-1) ){
                        ans.add(arr[i]);
                    }

                }
            }


        }
        return ans;
    }

    public static List<Integer> better(int [] arr){
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < arr.length ;i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);

            if(map.get(arr[i]) == (arr.length/3)+1){
                ans.add(arr[i]);
            }
            if(ans.size() == 2) {
                break;
            }


        }
        return ans;
    }

    public static List<Integer> optimal(int [] arr){
        List<Integer> ans = new ArrayList<>();
        int cnt1 = 0 ; int cnt2 = 0;
        int ele1 = 0; int ele2 =0;
        for(int i = 0; i < arr.length ; i++){
            if(cnt1 == 0 && arr[i] != ele2){
                cnt1 = 1;
                ele1 = arr[i];
            } else if (cnt2 == 0 && arr[i] != ele1) {
                cnt2 = 1;
                ele2 = arr[i];
            } else if (arr[i] == ele1) {
                cnt1++;
            } else if (arr[i] == ele2) {
                cnt2++;
            }
            else{
                cnt1 -- ; cnt2 --;
            }
        }
        ans.add(ele1);
        ans.add(ele2);
        return ans;
    }
}
