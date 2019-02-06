import java.util.List;

/**
 * Created by aivashchenko on 2/6/2019.
 */
public interface DataSource {
    List<String> getCamelCase();
    List<String> getPlainList();
    List<?> getRandomList();
}
