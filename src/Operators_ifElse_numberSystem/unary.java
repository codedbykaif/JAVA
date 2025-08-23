
public class unary {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        System.out.println(y);
        int z = -y;
        System.out.println(z);

//        preincrement unary operator
        System.out.println("This is preincrement: ");
        int a = 5;
        a += 1;
        System.out.println(a);
        ++a;
        System.out.println(a);

//        postincrement unary operator
        System.out.println("This is postincrement: ");
        int b = 53;
        b++;
        System.out.println(b);
    }
}
