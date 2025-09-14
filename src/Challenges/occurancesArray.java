package Challenges;
import java.sql.SQLOutput;
import java.util.Scanner;
public class occurancesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array occurances\n");
        int[] numArr = arrayUtility.inputArray();
        System.out.println("now enter the number you want to find: ");
        int num = input.nextInt();
        int occurances = noOfOccurances(numArr, num);
        System.out.println("Your number was found " + occurances + " times in the array");

    }
    public static int noOfOccurances(int[] numArr, int num){
        int occ = 0;
        int i = 0;
        while( i < numArr.length ){
            if(numArr[i] == num){
                occ++;

            }
            i++;
        }

        return occ;

    }
}
