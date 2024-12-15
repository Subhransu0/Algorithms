package arrays.easy;

public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {4,2,1,5,7,6};
        System.out.println(secondSmallest(arr));

    }
    public static int secondSmallest(int [] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i<= arr.length-1;i++){
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
    public  static int secondLargest(int [] arr){
        int largest = Integer.MIN_VALUE;
        int secondL = Integer.MIN_VALUE;
        for(int i = 0 ; i <= arr.length-1; i++){
            if(arr[i] > largest){
                secondL = largest;
                largest = arr[i];
            } else if (arr[i] > secondL && arr[i] != largest){
                 secondL = arr[i];
            }
        }
        return secondL;
    }
}
