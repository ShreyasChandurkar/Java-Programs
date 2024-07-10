import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Perfom Arithmetic Operations by selecting Appropriate key.");
        System.out.println("Select 1 for Add; 2 for Subtraction; 3 for multiplicaiton; 4 for division");
        int Calculator = scan.nextInt();
        System.out.println("Enter Value of A: ");
        int A = scan.nextInt();
        System.out.println("Enter Value of B: ");
        int B = scan.nextInt();

        switch (Calculator) {
            case 1:
                System.out.println("Sum of A+B is " + (A + B));

                break;
            case 2:
                System.out.println("Difference of A-B is " + (A - B));
                break;

            case 3:
                System.out.println("Multiplication of A*B is " + (A * B));
                break;
            case 4:
                System.out.println("Division of A/B is " + (A / B));
                break;
            default:
                System.out.println("Invalid input please enter valid input");
                break;
        }
    }
}