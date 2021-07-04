package input_form;

public class InitCapitalLetter {
    /**
     * Makes the first letter of the input string CAPITAL
     * @param makeCapital
     * @return makeCapital with CAPITAL first letter
     */
    public static String initCapital(String makeCapital) {
        makeCapital = ("" + makeCapital.charAt(0)).toUpperCase() + makeCapital.substring(1);
        return makeCapital;
    }
}
