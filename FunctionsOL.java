//In java there is function overloading feature which allows us to make multiple user defined function with same name but different parameters
public class FunctionsOL {
    // public static int Sum(int a, int b) {// func to calc sum of 2
    // return a + b;
    // }

    // public static int Sum(int a, int b, int c) {// func to calc sum of 3
    // return a + b + c;
    // }

    // public static int Sum(int a, int b, int c, int d) {// func to calc sum of 4
    // return a + b + c + d;
    // }

    // public static void main(String[] args) {// This is our main function void
    // means empty nothing not return anything
    // System.out.println(Sum(4, 6, 8, 24));

    // Function overloading using data types

    // function to calc int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calc float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3.2f, 4.6f));
        System.out.println(sum(7, 9));
    }

}
