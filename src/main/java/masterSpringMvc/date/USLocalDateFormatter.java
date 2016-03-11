package masterSpringMvc.date;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * Created by IntelliJ IDEA.
 * User: enreyes
 * Date: 3/10/2016
 * Time: 9:53 AM
 */
public class USLocalDateFormatter  implements Formatter<LocalDate>{

    private static final String US_PARRENT = "MM/dd/yyyy";
    private static final String NORMAL_PARRENT = "dd/MM/yyyy";

    @Override
    public LocalDate parse(String text, Locale locale) throws ParseException {
        return LocalDate.parse(text, DateTimeFormatter.ofPattern(getPattern(locale)));
    }

    @Override
    public String print(LocalDate object, Locale locale) {
        return DateTimeFormatter.ofPattern(getPattern(locale)).format(object);
    }

    public static String getPattern(Locale locale) {
        return isUnitedStates(locale) ? US_PARRENT : NORMAL_PARRENT;
    }

    public static boolean isUnitedStates(Locale locale) {
        return Locale.US.getCountry().equals(locale.getCountry());
    }

}
