import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to leap year program");
        System.out.println("Enter year to find if it is leap or not");
        int year = input.nextInt();

       if (year % 4 == 0){
           System.out.println("leap year: " + year);
       }
       else if(year % 400 == 0){
           System.out.println("leap year: " + year);

        }
       else {
           System.out.println("not a leap year: " + year);
       }


    }
}
