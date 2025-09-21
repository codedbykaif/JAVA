package Revision;

import java.util.Scanner;

public class Challenge_39_part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        // logic for right half pyramid
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
