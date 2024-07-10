import java.util.*;
public class Functions {
    public static int factorial(int n) {
        int fact = 1;
        int i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static int binCoeff(int n, int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int binco=fact_n/(fact_r*fact_nmr);
        return binco;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        System.out.print("Enter the value of R: ");
        int R = sc.nextInt();
        System.out.print("Binomial Coefficient of nCr= "+(binCoeff(N,R)));

    }

}
