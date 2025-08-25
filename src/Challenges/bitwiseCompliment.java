package Challenges;
import java.util.Scanner;
public class bitwiseCompliment{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise Compliment operator");
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        int result = ~num;
        System.out.println("Result is: " + result);


    }

}