public class PatternII {
    public static void hollow_Rectangle(int totRows, int totCols) {
        // Outer Loop
        for (int i = 1; i <= totRows; i++) {
            // Inner Loop
            for (int j = 1; j <= totCols; j++) {
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }

    }
    //Function for Inverse Half Pyramid
    public static void inverseHalfPyramid(int totRows) {
        // for Outer loop
        for (int i = 1; i <= totRows; i++) {
            // inner loop
            for (int j = 1; j <= totRows - i; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
    }
}
