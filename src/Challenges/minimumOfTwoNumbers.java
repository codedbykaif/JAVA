package Challenges;
import java.sql.SQLOutput;
import java.util.Scanner;
public class minimumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing a program that shows minimum among two numbers\n");
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
        MinimumTernary ternary = new MinimumTernary();
        int min = ternary.min(num1, num2);
        System.out.println("Minumum number is " + min);


    }
    public int min(int num1, int num2){
        return num1 < num2 ? num1 : num2;
    }

    static class MinimumTernary{

        public int min(int num1 , int num2){
            return num1 < num2 ? num1 : num2;

        }

        MinimumTernary(){

        }
    }
}
