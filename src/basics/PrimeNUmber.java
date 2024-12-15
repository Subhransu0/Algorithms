package basics;

public class PrimeNUmber {
    public static void main(String[] args) {

        System.out.println(primeNumber(27));

    }
    public static boolean primeNumber(int n){
        int c =  0;
        for(int i = 1 ; i <= Math.sqrt(n) ; i ++){
            if(n % i == 0){
                c = c+1;
                if(i != n/i){
                    c = c+1;
                }
            }
        }
        if( c== 2){
            return true;
        }
        else{
            return false;
        }
    }
}
