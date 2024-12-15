package basics;

import java.util.Scanner;

public class HashingNdFetching {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of array : ");
        int n = in.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < n ; i ++){
            System.out.println("Enter array value : ");
            arr[i] = in.nextInt();
        }

        int [] hash = new int[15];
        for(int i = 0 ; i< n ; i++){
            hash[arr[i]] = hash[arr[i]] + 1;
        }

        System.out.println("Enter the size of array to fetch : ");
        int q = in.nextInt();
        while(q-- != 0){
            System.out.println("Enter the value you want to fetch : ");
            int number = in.nextInt();
            System.out.println(hash[number]);

        }

    }

}
