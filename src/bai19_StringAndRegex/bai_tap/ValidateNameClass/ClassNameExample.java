package bai19_StringAndRegex.bai_tap.ValidateNameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME = "[CAP]\\d{4}[GHIKLM]";

    public ClassNameExample(){
        pattern = Pattern.compile(CLASS_NAME);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
