import java.util.*;

public class Conditional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Income Tax Calculator
        /*
         * System.out.print("\nEnter your Income: ");
         * float income = scan.nextFloat();
         * // else if statement used
         * if (income <= 500000) {
         * System.out.print("\n You have to pay 0% tax on your Income");
         * } else if (income > 500000 && income < 1000000) {
         * System.out.print("\nYou have to pay 20% tax on your Income which is " +
         * income * 0.2f);
         * } else {
         * System.out.print("You have to pay 30% tax on your Income which is " + income
         * * 0.3f);
         * }
         */
        // int A = scan.nextInt();
        // int B = scan.nextInt();
        /*
         * int C = scan.nextInt();
         * 
         * if (A > B && A > C) {
         * System.out.println("A is largest among three numbers.");
         * } else if (C > B) {
         * System.out.println("C is the largest among three numbers.");
         * } else {
         * System.out.println("B is the largest among three numbers.");
         * }
         */
        // Ternary Operator -- Variable = (Condition)?statement 1:statement 2;
        // int Biggest = (A>B)?A:B;
        // System.out.println("Biggest no of 2 is "+Biggest);

        // Check Student Pass or Fail by using Ternary Operator
        System.out.print("Enter your marks: ");
        int Marks = scan.nextInt();

        // Ternary Operator
        String Result = (Marks >= 36) ? "Pass" : "Fail";
        System.out.println(Result);
    }
}