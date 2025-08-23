import java.util.Scanner;
// perimeter of rectangle
public class perimeter {
    public static void  main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program is for finding the perimeter of rectangle: ");
        System.out.println("Enter all fours sides in cms: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double perimeter = a + b + c + d;
        System.out.println("Perimeter of rectangle is: " + perimeter );


    }

}
