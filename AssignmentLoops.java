import java.util.*;

public class AssignmentLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q:1-- How many times Hello is printed

        // for(int i=0; i<5; i++){
        // System.out.println("Hello");
        // i+=2;
        // }

        // Q:2-- Write a program that reads a set of integers, and then prints the sum
        // of even and odd integers
        // int sumeven = 0, sumodd = 0;
        // for (int choice = 1; choice == 1;) {
        // System.out.print("Enter the number: ");
        // int n = sc.nextInt();
        // if (n % 2 == 0) {
        // sumeven += n;
        // } else {
        // sumodd += n;
        // }
        // System.out.print("If you want to continue press 1 else 0: ");
        // choice = sc.nextInt();
        // }
        // System.out.print("Sum of Even integers is " + sumeven + "\nSum of Odd
        // Integers is " + sumodd);

        // Q:3-- Write a program to find the factorial of any number entered by user

        // System.out.print("Enter No. to find the factorial: ");
        // int n = sc.nextInt();
        // int fact = 1;
        // if (n == 0) {
        // System.out.print("Factorial of " + n + " is 1.");
        // }
        // for (int i = 1; i <= n; i++) {
        // fact *= i;
        // }
        // System.out.print("\nThe Factorial of " + n + " is: " + fact);

        // Q:4-- Write a program to print the multiplicaiton table of a number N,
        // entered by the user.

        // System.out.print("Enter the No. to print multiplication table: ");
        // int N = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // int table = N * i;
        // System.out.println(N + " * " + i + " = " + table);
        // table *= 0;
        // }

        // Didi's Solution for Q:4
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

}
