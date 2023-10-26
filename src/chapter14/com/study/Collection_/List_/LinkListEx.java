package chapter14.com.study.Collection_.List_;

/**
 * @author aj
 * @version 1.0
 */
public class LinkListEx {

    public static void main(String[] args) {
        Node FitstName = new Node("FirstName");
        Node SecondName = new Node("SecondName");
        Node ThirdName = new Node("ThirdName");
        Node four = new Node("four");
        Node five = new Node("five");
        Node six = new Node("six");
        FitstName.next = SecondName;
        SecondName.next = ThirdName;
        ThirdName.next = four;
        four.next = five;
        five.next = six;
        six.pre = five;
        five.pre = four;
        four.pre = ThirdName;
        ThirdName.pre = SecondName;
        SecondName.pre = FitstName;
        Node first = FitstName;
        Node last= six;
        Node 插入 = new Node("插入");

        插入.next = SecondName;
        插入.pre = FitstName;
        SecondName.pre = 插入;
        FitstName.next = 插入;
        while (true){
            if(first.next == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }


        while (true){
            if(last.pre == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

    }

}
class Node{
    public Node next;
    public Node pre;
    public Object item;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "NodeName= " + item ;
    }
}