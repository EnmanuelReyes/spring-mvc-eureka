package masterSpringMvc.error;

/**
 * Created by IntelliJ IDEA.
 * User: Enmanuel
 * Date: 16/07/2016
 * Time: 11:35 PM
 */
public class EntityNotFoundException extends Exception{
    public EntityNotFoundException(String message) {
        super(message);
    }

    public EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
