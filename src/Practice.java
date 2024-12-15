import java.lang.reflect.Array;
import java.util.*;


public class Practice {
    public static void main(String[] args) {
        int row = 5;
        int col = 3;
        System.out.println(rAndc(row -1 , col -1));

        System.out.println(printAll(row));

    }


    public static int rAndc(int row  , int col){
        int ans = 1;
        for(int i = 0 ; i < col ; i ++){
            ans = ans * (row - i);
            ans = ans / (i + 1) ;
        }
        return ans;
    }

    public static List<Integer> printRow(int row){
        List<Integer> arr = new ArrayList<>();
        int ans = 1;
        arr.add(ans);
        for(int i = 1 ;  i < row ; i++){
            ans = ans * (row - i);
            ans = ans / i ;
            arr.add(ans);
        }
        return arr;
    }

    public static List<List<Integer>> printAll(int row){
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 1 ; i <= row ; i++){
            arr.add(printRow(i));
        }
        return arr;
    }


}
