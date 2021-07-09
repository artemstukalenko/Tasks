package exceptions_article_first_part;

public class App21 {
    public static double sqr(double arg) {// согласно объявлению метода ты должен вернуть double
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return arg * arg;             // ок, вот твой double
        } else if (time % 2 == 1) {
                while (true) ;                 // не, я решил "повиснуть"
        } else {
                throw new RuntimeException(); // или бросить исключение
            }
        }
}