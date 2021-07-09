package exceptions_article_first_part;

public class App65 {
    public static void main(String[] args) {
        try {
            try {
                //...
            } catch (Exception e) {
                //...
            } finally {
                //...
            }
        } catch (Exception e) {
            try {
                //...
            } catch (Exception e1) {
                //...
            } finally {
                //...
            }
        } finally {
            try {
                //...
            } catch (Exception e) {
                //...
            } finally {
                //...
            }
        }
    }
}
