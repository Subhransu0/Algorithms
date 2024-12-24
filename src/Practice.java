import java.lang.reflect.Array;
import java.util.*;


public class Practice {


    public static boolean isPrimeNumber(int n){
        if(n <= 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        for(int i = 3 ; i <= Math.sqrt(n) ; i+=2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

public static boolean palindrome(int n){
        int c = n;
        int pal = 0;
        while(n != 0){
            int rem = n % 10;
            pal = (pal * 10) + rem;
            n = n / 10;
        }
        if(c == pal){
            return true;
        }
        return false;
}

public static int reverseNumber(int n){
        int rev = 0;
        while(n != 0){
            int rem =  n % 10;
            rev = (rev * 10)+ rem;
            n /= 10;
        }
        return rev;
}

public static int gcd(int a , int b){
        int gcd = 1 ;
        for(int i = 1 ; i <= Math.min(a,b); i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
}

public static int lcm(int a , int b){
        return Math.abs(a*b)/gcd(a, b);
}

public static boolean strPalindrome(String n){
        int s = 0 ;
        int e = n.length() -1;
        while(s < e){
            if(n.charAt(s) != n.charAt(e)){
                return false;
            }
            s++ ;
            e--;
        }
        return true;
}

public static List<Integer> fibo(int n){
        List<Integer> ans = new ArrayList<>();
        int a = 0 ;
        int b = 1;
        ans.add(a);
        ans.add(b);
        int s = 0;
        for(int i = 2; i <= n ; i++){
            s = a + b;
            ans.add(s);
            a = b;
            b = s;
        }
        return ans;
}

public static int removeDuplicate(int [] arr){
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i ++){
            set.add(arr[i]);
        }

        int size = set.size();
        int j = 0 ;
        for(int i : set){
            arr[j] = i;
            j++;
        }
        return size;
}

public static int removeDuplicateOptimal(int [] arr){
        int i = 0 ;
        for(int j = 0 ; j < arr.length;j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
}

public static int[] leftRotate(int [] arr){
        int temp = arr[0];
        for(int i = 1; i < arr.length ; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] =temp;
        return arr;
}


    public static int[] RightRotate(int [] arr){
        int temp = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0 ; i--){
            arr[i+1] = arr[i];
        }
        arr[0] =temp;
        return arr;
    }

    public static int[] leftRotateK(int [] arr , int k){
        k %= arr.length;
        int temp [] = new int[k];
        for(int i = 0 ; i < k ; i++){
            temp[i] = arr[i];
        }
        for(int i = 0 ; i < arr.length-k ; i ++){
            arr[i] = arr[k+i];
        }
        int j = 0;
        for(int i = arr.length - k ; i < arr.length ; i++){
            arr[i] = temp[j++];
        }
        return arr;
    }

    public static List<Integer> findUnion(int [] arr1 , int [] arr2){
        List<Integer> union = new ArrayList<>();
        int i = 0 ; int j = 0 ;
        while( i < arr1.length && j < arr2.length){
            if(arr1[i] <= arr2[j]){
                if(union.size() == 0  || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;

            }
            else{
                if(union.size() == 0 || union.get(union.size()-1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }
        while(i < arr1.length){
            if( union.get(union.size()-1)!= arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while(j < arr2.length){
            if( union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
return union;
    }

    public static int missingNumber(int [] arr){
        int n = arr.length + 1;
        int total = (n*(n+1))/2;
        int sum = 0 ;
        for(int i = 0 ; i  < arr.length ; i++ ){
            sum += arr[i];
        }
        return total -sum;
    }

    public static int one(int [] arr){
        int cnt = 0 ;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] == 1){
                cnt++;
                maxi= Math.max(maxi,cnt);
            }
            else{
                cnt = 0;
            }
        }
        return maxi;
    }


    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String s = in.next();

       int hash[] = new int[256];
       for(int i = 0 ; i < s.length();i++){
           hash[s.charAt(i)]++;
       }

       int q = in.nextInt();
       while(q-- > 0){
           char c = in.next().charAt(0);
           System.out.println(hash[c]);
       }


    }

}
