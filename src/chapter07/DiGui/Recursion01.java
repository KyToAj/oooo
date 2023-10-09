package DiGui;

public class Recursion01 {
    public static void main(String[] args) {
        a a = new a();
        a.re(5);
        a.jiecheng(5);
        System.out.println(a.jiecheng(5));
    }
}
class a{
    public void re(int n){
        if(n > 2){
            re(n-1);
        }
        else {
            System.out.println("n = " + n);
        }
    }
    public  int jiecheng(int re){
        if(re == 1){
            return 1;
        }else {
            return (jiecheng(re-1))*re;
        }
    }
}
