package Revision;
import java.util.Scanner;
public class Challenge_36 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showing a program that prints fibonacci series\n");
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        fibonacci(num);


    }
    public static void fibonacci(int num){
        int first = 0;
        int second = 1;
        System.out.println(first + ", ");
        System.out.println(second + ", ");
        while(first + second <= num){
            int third = first + second;
            System.out.println(third + ", ");
            first = second;
            second = third;

        }
    }
}

