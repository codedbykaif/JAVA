package Challenges;
import java.util.Scanner;
public class fibonacciseries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the program that prints fibonacci series");
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        finonacci(num);
    }
    public static void finonacci(int num) {
        int first = 0;
        int second = 1;
        System.out.print(first + " , ");
        System.out.print(second + " , ");
        while(first + second <= num){
            int third = first + second;
            System.out.print(third + " , ");
            first = second;
            second = third;

    }
    }
}
