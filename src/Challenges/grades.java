import java.util.Scanner;
public class grades {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to program that calculates grades of students: ");
        System.out.println("Enter marks of your first subject: ");
        int marks1 = input.nextInt();
        System.out.println("Enter marks of your second subject: "  );
        int marks2 = input.nextInt();
        System.out.println("Enter marks of your third subject: ");
        int marks3 =  input.nextInt();
        System.out.println("Enter marks of your fourth subject: ");
        int marks4 = input.nextInt();
        System.out.println("Enter marks of your fifth subject: ");
        int marks5 = input.nextInt();
        int sum = marks1 + marks2 +  marks3 + marks4 + marks5;
        float percentage = (sum / 500.0f) * 100;

        if(percentage >= 90 ) {
            System.out.println("A" + "you got"+ percentage + "%");
        }
        else if(percentage >= 75 && percentage < 89){
            System.out.println("B" + "you got" + percentage + "%");
        }
        else if(percentage >= 60 && percentage < 74 ) {
            System.out.println("C" + "you got" + percentage + "%");
        }
        else if(percentage >= 30 && percentage < 59 ) {
            System.out.println("D" + "you got" + percentage + "%");
        }
        else if (percentage < 30){
            System.out.println("F" + "you got" + percentage + "%");
        }







    }
}
