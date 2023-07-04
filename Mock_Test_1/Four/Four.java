//4. Write a Java program to find the largest of three numbers using nested if-else statements.


public class Four {

    public static void main(String[] args) {

        int[] arr = {45,101,3};

        //Finding the largest
        if(arr[0] > arr[1]){
            if(arr[0] > arr[2]) {
                System.out.println("The largest number is: " + arr[0]);
            }else {
                System.out.println("The largest number is: " + arr[2]);
            }
        } else if (arr[1] > arr[2]) {
            System.out.println("The largest number is: " + arr[1]);
        }else
            System.out.println("The largest number is: " + arr[2]);
    }
}
