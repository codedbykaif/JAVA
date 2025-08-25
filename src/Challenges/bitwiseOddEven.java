package Challenges;
import java.util.Scanner;

public class bitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcsing entered value is odd or even using bitwise and operator");
        System.out.println("Enter your number: ");
        int num = input.nextInt();

        if((num & 1) == 1){

            System.out.println("The eneterd number is odd: " + num);

        }
        else{
            System.out.println("the enterd number is even: " + num);
        }

    }
}
