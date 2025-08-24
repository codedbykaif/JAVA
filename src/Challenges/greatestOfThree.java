import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the program that finds greatest of three");
        System.out.println("Enter your first number: ");
        int first_num1 = input.nextInt();
        System.out.println("Enter your second number: ");
        int second_num2 = input.nextInt();
        System.out.println("Enter your third number: ");
        int third_num3 = input.nextInt();

        if(first_num1 > second_num2 &&  first_num1 > third_num3){
            System.out.println("first number is greatest: " + first_num1);
        }
        else if( second_num2 > first_num1 && second_num2 > third_num3){
            System.out.println("The second number is greatest: " + second_num2 );
        }
        else if (third_num3 > second_num2 && third_num3 > first_num1){
            System.out.println("Third number is greatest: " + third_num3);
        }


    }
}
