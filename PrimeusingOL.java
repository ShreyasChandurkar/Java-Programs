import java.util.*;
public class PrimeusingOL {
    // Only for n>=2
    public static boolean isPrime(int n) {
        // Corner Cases
        // 2
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {// Completely dividing
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(isPrime(6));

    }
}

