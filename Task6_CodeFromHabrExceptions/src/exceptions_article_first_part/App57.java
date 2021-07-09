package exceptions_article_first_part;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App57 {

    private void test1() {
        Lock lock = new ReentrantLock();
//...
        lock.lock();
        try {
            // some code
        } finally {
            lock.unlock();
        }
    }

    private void test2() throws IOException {
        InputStream input = new FileInputStream("...");
        try {
            // some code
        } finally {
            input.close();
        }
    }
}
