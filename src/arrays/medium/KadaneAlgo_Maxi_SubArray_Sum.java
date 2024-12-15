package arrays.medium;

public class KadaneAlgo_Maxi_SubArray_Sum {
    public static void main(String[] args) {

        int [] arr ={-2,-3,4,-3,5,-9};
        System.out.println(kadane(arr));

    }
    public static int kadane(int [] arr){
        int sum = 0 ;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length ; i++){
            sum += arr[i];
            maxi = Math.max(maxi,sum);
            if(sum < 0){
                sum = 0;
            }
        }

        return maxi;
    }

}
