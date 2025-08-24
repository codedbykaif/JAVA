import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even program");
        System.out.println("Enter your number: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}

