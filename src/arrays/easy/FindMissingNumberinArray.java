package arrays.easy;

public class FindMissingNumberinArray {
    public static void main(String[] args) {
        int arr [] ={1,2,3,5};
        System.out.println(XorMethod(arr,5));

    }
    public static int XorMethod(int [] arr , int n){
        int xor1 = 0 ;
        int xor2 = 0;
        for(int i = 0 ; i <n-1 ; i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }

    public static int sumMissingNumberOptimumSolustion(int [] arr , int n){
        int sum = n*(n+1)/2;
        int sum2 = 0;
        for(int i = 0; i < n-1 ; i++){
            sum2 = arr[i] + sum2;

        }
        return sum - sum2;
    }


    public static int hashMethodMissing(int [] arr , int n){
        int hash [] = new int[n+1];
        for(int i = 0 ; i < n-1 ; i ++){
            hash[arr[i]]++;
        }
        for(int i = 1 ; i <= n ; i++){
            if(hash[i] == 0){
                return i;
            }
        }
        return -1;
    }
 public static int missing(int [] arr , int n){
        for(int i = 1 ; i <=n ; i++){
            int store = 0;
            for(int j = 0 ; j < n-1 ;j++){
                if(arr[j] == i){
                    store = 1;
                    break;
                }
            }
            if(store == 0) return i;
        }
        return -1;
 }
}
