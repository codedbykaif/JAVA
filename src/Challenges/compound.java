import java.util.Scanner;

public class compound {
    public static void main(String[] args) {
//        compound intrest = P(1 + R/100)t
        Scanner input = new Scanner(System.in);

        System.out.println("Enter principle amount (P): ");
        double P = input.nextDouble();
        System.out.println("Enter annual rate of intresst (R): ");
        double R = input.nextDouble();
        System.out.println("Enter time in years (T): ");
        double T = input.nextDouble();

        double compound_int = P * (1 + R /100) *T;
        System.out.printf("Your compound intrest is: %.3f " , compound_int);

    }
}
