package Challenges;
import java.util.Scanner;
public class deletingElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Showcasing a program that deletes a specific element from array\n");
        int[] numArr = arrayUtility.inputArray();
        System.out.println("Now enter the number you want to delete; ");
        int numDelete = input.nextInt();
        int[] newArr = deletingArray(numArr, numDelete);

        System.out.println("Here is your new Array");

        arrayUtility.displayArray(numArr);




    }
    public static int[] deletingArray(int[] numArr, int numToDelete)
               {
        int occ = occurancesArray.noOfOccurances(numArr, numToDelete);
        if(occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
            int[] newArr = new int[newSize];
            int i = 0, j = 0;
            while(i < numArr.length){
                if(numArr[i] != numToDelete){
                    newArr[j] = numArr[i];
                     j++;
                }
                i++;
            }
            return numArr;


    }

}
