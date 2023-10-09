package Exercise;

public class ShiFouWeiShuiXianHuaShu {
    public static void main(String[] args) {
        //判断是否为水仙花数
        int n = 153;
        // 百位
        int a = (int)153/100;
        // 十位
        int b = (int)153%100/10;
        // 个位
        int c = (int)153%10;
        if(a * a * a + b * b * b + c * c * c == n ){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
