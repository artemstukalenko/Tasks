package exceptions_article_second_part;

public class App20 {
    public static void f0(Throwable t) throws Exception {
        //throw t; //will not compile
    }
    public static void f1(Object ref){
        //char c = ref.charAt(0); //will not compile
    }
}
