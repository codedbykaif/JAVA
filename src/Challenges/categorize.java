import java.util.Scanner;

public class categorize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to program that categorizes a person into different age groups");
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if(age <= 13 && age > 0 ){
            System.out.println("Child: " + age);
        }
        else if(age <= 20 && age > 13 ) {
            System.out.println("Teen: " + age);
        }
        else if(age <= 60 && age > 20){
            System.out.println("Adult: " + age);
        }
        else if(age > 60){
            System.out.println("Senior: " + age);
        }



    }
}
