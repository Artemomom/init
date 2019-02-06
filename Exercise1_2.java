import java.util.ArrayList;
import java.util.List;

/**
 * Created by aivashchenko on 2/6/2019.
 */
public class Exercise1_2 {
    private List<String> list;



    Exercise1_2(List<String> list) {
        this.list = list;
    }

    String getCamelCaseString(){
        String result="";
        for (String string:list){
            if(string==null){
                throw new IllegalArgumentException();
            }else {
               result+=makeFirstCapital(string);
            }
        }return result;
    }

    private String makeFirstCapital(String string){
        return string.substring(0,1).toUpperCase()+string.substring(1);
    }
    List reverse(List list){
        List<Object> temp = new ArrayList<Object>();
        for (int i = list.size()-1; i >=0 ; i--) {
            if(list.get(i)==null){
                throw new IllegalArgumentException();
            } else {
            temp.add(list.get(i)+" ");}

        }
        return temp;
    }
}
