import java.util.*;

/**
 * Created by aivashchenko on 2/6/2019.
 */
public class mainClass {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings,"first","second","third","fourth");
        Exercise1_2 e = new Exercise1_2(strings);
        System.out.println("****************task 1******************");
        System.out.println(e.getCamelCaseString());
        System.out.println("****************task 2******************");
        e.reverse(strings).forEach(System.out::print);


    }

}
