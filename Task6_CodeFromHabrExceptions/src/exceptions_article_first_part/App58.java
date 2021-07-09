package exceptions_article_first_part;

public class App58 {
    public static void main(String[] args) {
        System.err.println(f());
    }

    public static int f() {
        long rnd = System.currentTimeMillis();
        boolean finished = false;
        try {
            if (rnd % 3 == 0) {
                throw new Error();
            } else if (rnd % 3 == 1) {
                throw new RuntimeException();
            } else {
                // nothing
            }
            finished = true;
        } finally {
            if (finished) {
                return 0; //my own line
                // не было исключений
            } else {
                return 1; //my own line
                // было исключение, но какое?
            }
        }
    }
}
