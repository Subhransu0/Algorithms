package arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OverLapping {

    public int[][] merge(int[][] arr) {
        Arrays.sort(arr , (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> ans = new ArrayList<>();
        for(int i = 0 ; i  < arr.length ; i ++){
            int start = arr[i][0];
            int end = arr[i][1];
            if(!ans.isEmpty() && end <= ans.get(ans.size()-1)[1]) continue;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j][0] <= end){
                    end = Math.max(end , arr[j][1]);
                }
                else{break;}
            }
            ans.add(new int[]{start,end});
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
