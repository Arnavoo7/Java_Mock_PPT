//2. Write a Java program to print the Fibonacci series up to a given number using a for loop.


import java.util.Scanner;

public class Two {

    public static void operation(int n){

        int first = 0, second = 1, sum = 0;

        System.out.println("Fibonacci series up to " + n + " numbers is:");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + ", ");

            sum = first + second;
            first = second;
            second = sum;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Two.operation(number);
    }
}
