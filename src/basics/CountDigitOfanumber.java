package basics;

public class CountDigitOfanumber {
    public static void main(String[] args) {
      int a= countDigitOfaNumber(123456);
        System.out.println(a);

    }

    public static  int countDigitOfaNumber(int n){
        int count = 0 ;
        while(n > 0){
            count ++;
            n = n/10;
        }

        return count;
    }
}
