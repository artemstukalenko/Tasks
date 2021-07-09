package exceptions_article_second_part;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class App12 {
    public static void main(String[] args) throws IOException, InterruptedException {
        f0();
        f1();
        f2();
    }
    public static void f0() throws EOFException {/*...*/}
    public static void f1() throws FileNotFoundException {/*...*/}
    public static void f2() throws InterruptedException {/*...*/}
}
