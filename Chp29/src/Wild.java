import java.util.Collection;
import java.util.Vector;

/**
 * Created by FRESHIELD on 2016/11/23.
 */
public class Wild {
    Collection<?> contents(){
        Collection<String> stuff = new Vector<String>();
        stuff.add("a");
        stuff.add("b");
        stuff.add("see");
        return stuff;
    }
}
