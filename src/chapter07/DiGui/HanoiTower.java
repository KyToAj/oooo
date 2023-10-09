package DiGui;

public class HanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.ma(5,'A','B','C');
    }
}
class Tower{
    public void ma(int num , char a , char b , char c   ){
        if(num == 1){
            System.out.println(a +  "-->" + c);
        }
        else {
            //如果有多个盘，可以看成两个，最下面的和上面的所有盘（num-1）
            //先移动上面的所有盘 （递归） 借助  c  移动到 b
            ma(num-1,a,c,b);
            //再将 a 移动到 c
            System.out.println(a + "-->" + c);
            //最后将 b 借助 a 移动到  c
            ma(num-1 ,b,a,c);
        }

    }
}