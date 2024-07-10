import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the no. you want to print till: ");
        // int n=sc.nextInt();
        // int counter = 1;
        // while (counter <= n) {
        // System.out.print(counter+" ");
        // counter++;
        // }

        // Print Sum of n Natural Nos.
        // System.out.print("Enter the no.: ");
        // int n = sc.nextInt();
        // int sum = 0;
        // for(int i=1; i<=n; i++){
        // sum+=i;
        // }
        // int sum = 0 , i = 1;
        // while(i<=n){
        // sum +=i;
        // i++;
        // }
        // System.out.println("Sum Of "+n +"Natural Numbers is : " +sum);

        // Write code to print table of 3
        // for(int i=3; i<=30; i+=3){
        // System.out.println(i);
        // }

        // Print **** pattern
        // for(int i = 1; i!=5; i+=1){
        // System.out.println("****");
        // }

        // Print the Reverse of a number: 10899
        // System.out.print("Enter the No. which you want to reverse: ");
        // int n = sc.nextInt();
        // System.out.print("Enter the length of No.: ");
        // int length = sc.nextInt();
        // int no = 0;
        // for(int i=1; i<=length; i++){
        // no= n % 10;
        // System.out.print(no);
        // n/=10;
        // }
        // Didi's Solution
        // System.out.print("Enter the No: ");
        // int n = sc.nextInt();

        // while(n>0){
        // int lastdigit=n%10;
        // System.out.print(lastdigit);
        // n/=10;
        // }

        // Store the Reverse the given number we have to store
        // System.out.print("Enter the No.: ");
        // int n = sc.nextInt();
        // int rev = 0;
        // while (n > 0) {
        // int lastdigit = n % 10;
        // // rev = rev * 10 + lastdigit;
        // rev *= 10; rev+=lastdigit;
        // n /= 10;
        // }
        // System.out.println(rev);

        // Do while loop
        // int n = 108111;
        // int Reverse = 0;
        // do {
        // int digit = n % 10;
        // Reverse *= 10;
        // Reverse += digit;
        // n /= 10;
        // } while (n > 0);
        // System.out.println(Reverse);

        // Break Statement
        // for (int i = 1; i != 10; i++) {
        // if (i == 7) {
        // break; // This will terminate the current iteration and move on with next
        // statement after this line
        // }
        // System.out.print(i + "\n");
        // }

        // Keep entering numbers till user not enters a multiple of 10

        // System.out.print("Enter a number : ");

        // do{
        // int multiple = sc.nextInt();
        // if(multiple%10==0){
        // break;
        // }
        // System.out.print(multiple);
        // }while(true);
        // Using while loop
        // while(true){
        // int multiple = sc.nextInt();
        // if(multiple%10==0){
        // break;
        // }
        // System.out.println(multiple);
        // }

        // Using for Loop
        // for(;true;){
        // int multiple = sc.nextInt();
        // if(multiple%10==0){
        // continue;//Print all the numbers enter by the user except multiple of 10
        // }
        // System.out.println(multiple);
        // }

        // Continue Statement
        // for(int i=1; i<=50; i++){
        // if(i%5==0){
        // continue;
        // }
        // System.out.print(i+" ");
        // }

        // Check whether No. is Prime or Not
        System.out.print("Enter the No. to check prime or not : ");
        int n = sc.nextInt();
        // if (n == 1 || n == 2) {
        // System.out.print(n + " IS PRIME NO.");
        // } else {
        // for (int i = 2; i <= Math.sqrt(n); i++) {//Make Optimised for big no.
        // if (n % i == 0) { // n is a multiple of i (i not equal to 1 or n)
        // System.out.println(n + " Is NOT PRIME");// n is composite no. not prime no.
        // break;
        // } else {
        // System.out.println(n + " IS PRIME");
        // break;
        // }
        // }
        // }

        // Didi's Solution
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {// Make Optimised for big no.
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.print(n + " is a Prime No.");
        } else {
            System.out.print(n + " is Composite Number and it cannot be divided into any other");
        }
    }
}
