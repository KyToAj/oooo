package Tank.Ex;

import javax.swing.*;
import java.awt.*;

/**
 * @author aj
 * @version 1.0
 */
public class TryTank extends JFrame {
    private Try aTry = null;


    public static void main(String[] args) {
//        Try aTry = new Try();
        TryTank tryTank = new TryTank();
    }
    public TryTank(){
        //初始化面板
        aTry = new Try();
        //放入画框
        this.add(aTry);
        //设置窗口大小
        this.setSize(500,500);
        //点击 x ，退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getDefaultCloseOperation();
        this.setVisible(true);//可以显示
    }
}
class Try extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(55,60,30,32);
        g.setColor(Color.blue);
        g.fillRect(50,50,15,50);
        g.fillRect(80,50,15,50);
        g.fillOval(63,65,20,20);
        g.drawOval(63,65,20,20);
        g.fillRect(72,50,2,30);
//        g.drawLine(72,50,72,80);

    }
}
