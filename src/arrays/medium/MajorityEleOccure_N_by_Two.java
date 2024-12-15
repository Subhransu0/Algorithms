package arrays.medium;

public class MajorityEleOccure_N_by_Two {
    public static void main(String[] args) {
        int arr [] = {2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,2,2,2,1,1,1,1,1,1,1,1,1};
        System.out.println(optimalSolution(arr));

    }
    public static int optimalSolution(int [] arr){
        int cnt = 0 ;
        int ele = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(cnt == 0){
                cnt = 1 ;
                ele = arr[i];
            } else if (arr[i] == ele) {
                cnt++;
            }else{
                cnt--;
            }
        }


        int cnt1 = 0 ;
        for(int i = 0 ; i < arr.length ; i ++){
            if(arr[i] == ele){
                cnt1 ++;
            }
        }
        if(cnt1 > arr.length/2){
            return ele;
        }
        return -1;
    }
}
