package whileLoop_methods_Arrays;

public class functionLoop    {
    public static void main(String[] args) {
        patternWithLoop();

    }
    public static void patternWithLoop(){
        int rows = 1;

        while (rows <= 5){

            int coll = 0;
            while(coll < rows) {
                System.out.print("*");
                coll++;
            }
            System.out.println();
            rows++;

        }
    }
}
