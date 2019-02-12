import java.util.List;

/**
 * Created by aivashchenko on 2/11/2019.
 */
public class CamelCaseBusinessLogicClass implements CamelCaseService {

    @Override
    public String getCamelCaseString(List<Object> objects) {
        String result = "";
        if (objects == null) {
            throw new IllegalArgumentException();
        }
        else if (objects.isEmpty()) {
            result = "Message for logger: you have provided empty list";
        }
        else {
            for (Object object : objects) {
                result += concatenateString(object);
            }
        }
        return result;
    }


    private String makeFirstCapital(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    private String concatenateString(Object object) {
        String string = "";
        if (object instanceof String && object != null) {
            string += makeFirstCapital(object.toString());
        }
        else {

            throw new IllegalArgumentException();
        }
        return string;
    }


}
