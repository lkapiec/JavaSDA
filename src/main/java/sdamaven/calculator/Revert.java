package sdamaven.calculator;

public class Revert {

    public String dajOstatnia(String base)
    {
        if(base.length() == 1) {
           // System.out.println("koniec> " + base);
            return base;
        } else {
            String testWithoutLastLetter = base.substring(0, base.length() - 1);
            String lastLetter = base.substring(base.length() - 1);

            //System.out.println("lastLetter> '" + lastLetter + "' testWithOut> '" + testWithoutLastLetter+"'");

            return lastLetter + dajOstatnia(testWithoutLastLetter);
        }
    }


}
