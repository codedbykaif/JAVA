package Challenges;
import java.util.Scanner;
public class leastCommonMulltiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing the least common factor program");
        System.out.println("enter your first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second numner: ");
        int num2 = input.nextInt();
        int leastCommonFactor = leastCommonMultiple( num1, num2);
        System.out.println("LCM of two numbers is: " +leastCommonFactor);


    }
    public static int leastCommonMultiple(int num1, int num2){
        int i =1;
        while(true){
            int factor = num1 * i;
            if(factor % num2 == 0){
                return factor;
            }

            i++;
        }

    }
}
