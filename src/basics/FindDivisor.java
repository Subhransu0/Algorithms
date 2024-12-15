package basics;

import java.util.ArrayList;
import java.util.List;

public class FindDivisor {
    public static void main(String[] args) {

        List<Integer> ans = findDivisor(36);
        for(int i : ans){
            System.out.print(i + " , ");
        }


    }
    public static List<Integer> findDivisor(int n){
        List<Integer> div = new ArrayList<>();
        int sqrt = (int) Math.sqrt(n);
        for(int i = 1 ; i <= sqrt ; i++){
            if(n % i == 0){
                div.add(i);
                if(i != n/i){
                    div.add(n/i);
                }
            }
        }
        return div;
    }
}
