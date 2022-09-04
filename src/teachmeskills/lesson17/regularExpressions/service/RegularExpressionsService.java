package teachmeskills.lesson17.regularExpressions.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsService {
    public boolean checkStringTaskOne(String string) {
        Pattern pattern = Pattern.compile("^\\d+[a-zA-Z]{5,10}+\\W+(.|$)+$");

        Matcher matcher = pattern.matcher(string);

        if (!matcher.matches()) {
            return false;
        }

        return true;
    }

    /*public boolean checkStringTaskTwo(String string) {
        Pattern pattern = Pattern.compile("\\");

        Matcher matcher = pattern.matcher(string);

        if (!matcher.matches()) {
            return false;
        }

        return true;
    }*/
}
