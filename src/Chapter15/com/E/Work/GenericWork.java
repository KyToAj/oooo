package Chapter15.com.E.Work;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author aj
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class GenericWork {
    public static void main(String[] args) {

    }
    @Test
    public void testList(){
        DAO<User> dao = new DAO<>();
        dao.save("a",new User(01,18,"aj"));
        dao.save("b",new User(02,22,"sdasd"));
        dao.save("c",new User(03,14,"12a"));
        List<User> list = dao.list();
        System.out.println(list);
        System.out.println(dao.get("a"));
        dao.delete("a");
        list = dao.list();
        System.out.println(list);
    }
}

