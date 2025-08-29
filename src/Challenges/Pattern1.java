package Challenges;

public class Pattern1 {
    public static void main(String[] args) {
        patternPrinting2(5);

    }
    public static void patternPrinting1(int number){
        int row = number;
        while(row> 0 ){
            int coll = 0;
            while(coll< row){
                System.out.print("*");
                coll++;
            }
            System.out.println();
            row--;
        }
    }
    public static void patternPrinting2(int number){
        int row = 1;
        while(row < number){
            int coll = number;
            while(coll > row){
                System.out.print("\t");
                coll--;
            }
            // print start
            int s = 0 ;
            while(s< row){
                System.out.print("*");
                System.out.print("\t");
                s++;
            }
            System.out.println();
            row++;
        }
    }
}
