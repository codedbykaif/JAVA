package whileLoop_methods_Arrays;

public class function {
    public static void main(String[] args) {
        System.out.println("In main method");
        greetUser();
        System.out.println("Method calling complete");
        greetUser();
        printFirstPattern();
        System.out.println("\n");
        printSecondNumber();
        System.out.println("\n");
        printThirdPatter();

    }
    public static void printFirstPattern () {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");
    }
    public static void printSecondNumber() {
        System.out.println("* * * * *");
        System.out.println("* * * * ");
        System.out.println("* * * ");
        System.out.println("* * ");
        System.out.println("* ");
    }
    public static void printThirdPatter(){
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
    public static void greetUser() {
        System.out.println("Good morining from dreamer: ");
        System.out.println("my favrouite writter is dostoevsky");
    }
}
