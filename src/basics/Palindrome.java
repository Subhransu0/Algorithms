package basics;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println(palindromeNumber(252));

    }
    public  static  boolean palindromeNumber(int n){
        int c = n;
        int pal =  0;
        while(n > 0){
            int rem = n % 10;
            pal = (pal * 10 )+ rem;
            n = n/10;

        }
       return c == pal;
    }
}
