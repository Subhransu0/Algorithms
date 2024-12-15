package arrays.hard;

import java.util.ArrayList;
import java.util.List;

public class pascal {
    public static void main(String[] args) {

        int row = 5;
        int col = 3;

        System.out.println(ncr(row-1 , col -1));

        List<Long> ans = optimal(5);

        for(long i : ans){
            System.out.print(i + " ");
        }

    }
    public static int ncr(int n , int r){
        int res = 1;
        for(int i = 0 ; i < r ; i ++){
            res = res * (n - i);
            res = res / (i+1);
        }
        return res;
    }

    public static List<Integer> brutePrintRow(int row){
        List<Integer> arr = new ArrayList<>();
        for(int i = 1 ; i <= row ; i++){
            int ans = ncr(row -1 , i-1);
            arr.add(ans);
        }
        return arr;
    }

    public static List<Long> optimal(int row){
        List<Long> arr = new ArrayList<>();

        long ans = 1;
        arr.add(ans);
        for(int i = 1  ; i < row ; i++){
            ans = ans * (row - i);
            ans = ans / i;
            arr.add(ans);
        }
        return arr;
    }

    public static int[][] bruteTotalPrintN(int row){
        int [][] arr = new int[row][];
        for(int i = 0 ; i < row ; i++){
            arr[i] = new int[i+1];
            for(int j = 0 ; j < i+1; j++){
                arr[i][j] = ncr(i,j);
            }
        }
        return arr;
    }

}
