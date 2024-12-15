package arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArrayElement {
    public static void main(String[] args) {
        int [] arr ={-1,2,3,4,-3,1};

        System.out.println(Arrays.toString(sizeIsNotEqual(arr)));


    }

    public static int[] optimalSolution(int [] arr){
        int ans [] = new int[arr.length];
        int pos = 0;
        int neg = 1;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 0){
                ans[pos] = arr[i];
                pos += 2;
            }
            else{
                ans[neg] = arr[i];
                neg += 2;
            }
        }
        return ans;
    }

    public static int [] rearrange(int [] arr){
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i = 0  ; i < arr.length ; i++){
            if(arr[i] < 0){
                neg.add(arr[i]);
            }else{
                pos.add(arr[i]);
            }
        }

        for(int i = 0 ; i < arr.length/2 ; i++){
            arr[2 * i] = pos.get(i);
            arr[2*i+1] = neg.get(i);
        }
        return arr;
    }

    public static int[] sizeIsNotEqual(int [] arr){

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }else {
                neg.add(arr[i]);
            }
        }

        if(pos.size() > neg.size()){
            for(int i = 0 ; i < neg.size() ; i++){
                arr[i * 2] = pos.get(i);
                arr[i * 2+ 1] = neg.get(i);
            }
            int index = neg.size()*2;
            for(int i = neg.size() ; i < pos.size(); i++){
                arr[index] = pos.get(i);
                index++;
            }
        }
        else{
            for(int i = 0 ; i < pos.size() ; i++){
                arr[i * 2] = pos.get(i);
                arr[i * 2 + 1] = neg.get(i);
            }
            int index = pos.size()*2;
            for(int i = pos.size() ; i < neg.size();i++){
                arr[index] = neg.get(i);
                index++;
            }
        }
return arr;

    }
}
