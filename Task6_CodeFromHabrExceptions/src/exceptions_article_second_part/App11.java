package exceptions_article_second_part;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App11 {
    // пугаем ПРЕДКОМ исключений
    public static void main(String[] args) throws IOException {
        f0();
        f1();
    }
    public static void f0() throws EOFException {/*...*/}
    public static void f1() throws FileNotFoundException {/*...*/}
}
