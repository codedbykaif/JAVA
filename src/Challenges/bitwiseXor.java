
package Challenges;
import java.util.Scanner;
public class bitwiseXor
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise Xor operator");
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: " );
        int second = input.nextInt();
        int result = first ^ second;
        System.out.println("Result is: " + result);

    }
}
