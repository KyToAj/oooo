package chapter14.com.study.Collection_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author aj
 * @version 1.0
 */
public class util_ {@SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList objects = new ArrayList();
        objects.add("smith");
        objects.add("john");
        objects.add("jack");
       Object obj = Collections.max(objects, new Comparator() {
           @Override
           public int compare(Object o1, Object o2) {
               return ((String)o1).length() - ((String)o2).length();
           }
       });
    System.out.println(obj);
    ArrayList arrayList = new ArrayList(objects.size());
    for (int i = 0; i < objects.size(); i++) {
        arrayList.add("");
    }
    Collections.copy(arrayList,objects);
    System.out.println(arrayList);
    Collections.replaceAll(arrayList,"jack","杰克");
    System.out.println(arrayList);

}
}