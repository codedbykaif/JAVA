import java.util.Scanner;
public class bitwiseAnd
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing bitwise And operator");
        System.out.println("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: " );
        int second = input.nextInt();
        int result = first & second;
        System.out.println("Result is: " + result);

    }
}
