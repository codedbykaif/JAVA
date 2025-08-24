import java.util.Scanner;
public class relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to driving license portal");
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if(age>=18){
            System.out.println("Congrats you are eligible, and your age is: " + age);

        }
        else
        {
            System.out.println("Sorry you are not eligible because your age is: " + age);
        }

    }
}
