import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GermanStyleDateChecker {
    public static Matcher getMatcher(String dateString) {       
        Pattern pattern = Pattern.compile("^((0?[1-9]|[12][0-9]|3[01])([\\.|\\-|\\ ])(0?[1-9]|10|11|12)([\\.|\\-|\\ ])((19?[0-9][0-9])|((20)?[0-9][0-9])))$");
        Matcher matcher = pattern.matcher(dateString);        
        return matcher;
    }
}
