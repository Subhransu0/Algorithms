package arrays.medium;

import java.util.Arrays;

public class Rotate2Darrary {
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
   int ans[][] = brute(arr);
   for(int i = 0 ;  i < ans.length;i++){
       for(int j = 0 ;  j < ans.length ; j ++){
           System.out.print(ans[i][j] + " ");
       }
   }

    }
    public static int[][] brute(int [][] arr){
        int [][] ans = new int[arr.length][arr.length];
        for(int i = 0 ;  i < arr.length ; i ++){
            for(int j = 0 ;  j < arr[i].length ; j ++){
                ans[j][(arr.length-1)-i] = arr[i][j];
            }
        }
        return ans;
    }
    public static void swap(int [][] arr , int i , int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    public static void optimal(int[][] arr){
        for(int i = 0 ;  i < arr.length-1 ; i++){
            for(int j = i+1 ; j < arr.length ; j ++){
                swap(arr,i,j);
            }
        }
        for(int i = 0 ;  i < arr.length ; i++){
            for(int j = 0 ; j < arr.length/2 ; j ++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][(arr.length-1)-j];
                arr[i][(arr.length-1)-j] = temp;
            }
        }
    }
}
