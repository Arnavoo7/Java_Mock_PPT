//3. Write a Java program to calculate the average of a list of numbers using a do-while loop.

public class Three {

    public static float operation(int[] narr){

        int sum=0,i=0;
        do{
            sum += narr[i];
            i++;
        }while(i<=(narr.length-1));

        return (sum/5f);
    }

    public static void main(String[] args) {

        //list of numbers
        int[] arr = {30,45,60,76,80};

        System.out.println("The average of the list of numbers is: " + Three.operation(arr));
    }
}
