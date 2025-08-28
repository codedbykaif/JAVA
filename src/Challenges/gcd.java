package Challenges;
import javax.swing.plaf.PanelUI;
import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing a program to find Greates Common Divisor (GCD)");
        System.out.println("Enter your first number");
        int num1 = input.nextInt();
        System.out.println("Enter your second number");
        int num2 = input.nextInt();
        int Gcd = Gcd(num1, num2);
        System.out.println("GCD of the number is: " + Gcd);

    }
    public static int Gcd(int first, int second ){
        int Gcd = 1;
        int i = 2;
        int least = least(first, second);
        while(i <= least){
            if(first % i == 0 && second % i == 0){
                Gcd = i;
            }
                i++;
        }
        return Gcd;
    }
    public static int least(int first, int second){
        if(first < second){
            return first;
        }
        else{
            return second;
        }
    }
}
