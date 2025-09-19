package Revision;
import javax.crypto.spec.PSource;
import java.util.Scanner;
public class Challnge_32 {
    public static int gcd(int a, int b){
        while(b !=0){
            int temp = b;
            b = a%b;
            a = temp;

        }
        return a;
    }
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to program thar finds the least common multiple of two numbers\n");
        System.out.print("Enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = input.nextInt();
//        Calculate LCM usign formula
        int gcdvalue = gcd(num1, num2);
        int lcm = (num1 * num2) / gcdvalue;

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);


    }
}
