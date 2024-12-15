package arrays.easy;

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,7};
        int arrr[] ={2,3,5,6,7,8};

        ArrayList<Integer> union = FindUnion(arr,arrr);
        for(int i : union){
            System.out.println(i);
        }
    }

    public static ArrayList<Integer> FindUnion(int arr1[], int arr2[]) {
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] <= arr2[j]) {
                if(union.size() == 0 || arr1[i] != union.get(union.size() - 1)) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if(union.size() == 0 || arr2[j] != union.get(union.size() - 1)) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }

        // Add remaining elements of arr1
        while(i < arr1.length) {
            if(union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // Add remaining elements of arr2
        while(j < arr2.length) {
            if(union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union;
    }
}
