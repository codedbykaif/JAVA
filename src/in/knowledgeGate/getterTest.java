package in.knowledgeGate;

import Classes_And_Objects.Car;
import in.GetterandSetter.Book;
import org.w3c.dom.ls.LSOutput;

public class getterTest {
   public static void main() {
    Book book = new Book("red", "maruti", 3, 8000);
        System.out.println();
       System.out.printf("%s %s", book.getColor(), book.getModel());
    }

}

