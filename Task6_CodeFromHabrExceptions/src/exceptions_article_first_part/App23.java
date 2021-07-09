package exceptions_article_first_part;

public class App23 {
    public static int area(int width, int height) {
        if (width < 0 || height < 0) {
            return 1; //my own line
            // у вас плохие аргументы, извините
        } else {
            return width * height;
        }
    } /*missing return statement*/

    public static int area1(int width, int height) {
        if (width < 0 || height < 0) {
            System.out.println("Bad ...");
        }
        return width * height;
    }

    public static int area2(int width, int height) {
        if (width < 0 || height < 0) {
            return -1; // специальное "неправильное" значение площади
        }
        return width * height;
    }

    public static int area3(int width, int height) {
        if (width < 0 || height < 0) {
            System.exit(0);
        }
        return width * height;
    }

    public static int areaRight(int width, int height) {
        if (width < 0 || height < 0) {
            throw new IllegalArgumentException("Negative sizes: w = " + width + ", h = " + height);
        }
        return width * height;
    }

}
