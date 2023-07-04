//1. Write a Java program to check whether a given number is positive, negative, or zero using an if-else statement.


import java.util.Scanner;

public class One {

    public static String operation(int n){

        if(n == 0)
            return "The given number is zero.";
        else if (n < 0)
            return "The given number is negative.";
        else
            return "The given number is positive.";

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(One.operation(number));


    }
}