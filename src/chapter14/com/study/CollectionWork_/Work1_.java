package chapter14.com.study.CollectionWork_;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author aj
 * @version 1.0
 */
public class Work1_ {
    public static String processTitle(String title){
        if(title == null){
            return "";
        }
        if(title.length() > 15){
            return title.substring(0,15) + "...";
        }else {
            return title;
        }
    }
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊人数超过千万，数百万印度教信徒夫恒河\"圣浴\"，引民众担忧"));
        arrayList.add(new News("与再往都"));
        for (int i = arrayList.size()-1; i >=0 ; i--) {
            News news1 = (News)arrayList.get(i);
            System.out.println(processTitle(news1.getTitle()));
        }
//        Iterator iterator = arrayList.iterator();
//        while (iterator.hasNext()){
//            Object obj = iterator.next();
//            System.out.println(obj);
//        }
    }
}
class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return
                "title=" + title ;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}