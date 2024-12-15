package basics;

public class ReverseAnumber {
    public static void main(String[] args) {
        int ans = reverse(-123456);
        System.out.println(ans);
    }

    public static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int rem = n % 10;
            rev = (rev * 10)+ rem;
            n= n /10;

        }
        return rev;
    }
}
