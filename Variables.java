
//Boilerplate Code
import java.util.*;

public class Variables {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
         * System.out.print("Hello Shreyas\nWelcome to Pune\n");
         * System.out.print("******\n*****\n****\n***\n**\n*");
         * int a='k';
         * System.out.println(a);
         */

        /*
         * System.out.print("Enter the Value of A ");
         * int A = scan.nextInt();
         * 
         * System.out.print("Enter the Value of B ");
         * int B = scan.nextInt();
         * 
         * int Sum = A+B; //Sum of two Numbers
         * //System.out.println(A + B);
         * //A = B;
         * System.out.println("Sum of A&B is "+ Sum);
         */
        /*
         * System.out.print("Your Name Please ");
         * String name=scan.nextLine();
         * System.out.print("Hello "+name+"\nWelcome to VIIT");
         */

        // Write code to find out Area of Circle
        /*
         * System.out.print("Enter the value of Radius ");
         * float Radius = scan.nextFloat();
         * float Area = 3.14f * Radius * Radius;
         * System.out.println("Area of Circle is " + Area);
         */
        // int A = (int) (78.8f);
        // System.out.println(A);
        /*
         * int A = 10;//Average of 3 nos.
         * int B = 10;
         * int C = 10;
         * int Average = (A+B+C)/3;
         * 
         * System.out.println("Average of these 3 nos is "+ Average);
         */

        /*
         * int Side = 2;// Area of a Square
         * int Area = Side*Side;
         * System.out.println("Area of Square is: "+Area);
         */

        /*
         * System.out.print("Pencil Cost: ");//Total Cost of Items including gst
         * float Pencil = scan.nextFloat();
         * System.out.print("Pen Cost: ");
         * float Pen = scan.nextFloat();
         * System.out.print("Eraser Cost: ");
         * float Eraser = scan.nextFloat();
         * float Total = Pencil + Pen + Eraser;
         * float GST = (Total*18)/100;
         * System.out.println("Total Cost of Items including 18% GST: "+ (Total+GST));
         */

        // What will be the type of result in which data type it should be convert
        /*
         * byte b = 4;
         * char c = 'a';
         * short s = 512;
         * int i = 1000;
         * float f = 3.14f;
         * double d = 99.9954;
         * 
         * System.out.println((f*b)+(i%c)-(d*s));
         */
        // int $ = 23;
        // System.out.println($);

        /*
         * int x = 10, y = 5;
         * int exp1 = (5*(10/5+10/5)), exp2= (5*10/5+5*10/5);
         * System.out.println(exp1);
         * System.out.println(exp2);
         */

        // int x = 9, y = 12;
        // int a = 2, b = 4, c = 6;

        // int exp = 4 / 3 * (9 + 34) + 9 * (2 + 4 * 6) + (3 + 12 * (2 + 2)) / (2 + 4 *
        // 12);
        // System.out.println(exp);

        /*
         * int x=2, y=5;
         * int exp1 = (x*y/x);
         * int exp2 = (x*(y/x));
         * System.out.println(exp1);
         * System.out.println(exp2);
         */

        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
        System.out.println(z);
    }
}