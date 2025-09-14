package Challenges;
public class sumPositive {
    public static void main(String[] args) {
        System.out.println("Showcasing a program that prints sum of positive numbers\n");
        int[] numArr = arrayUtility.inputArray();

        int sum = 0;
        for(int num: numArr) {
            if(num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("The sum of positive numbers is: " + sum );
    }
}

