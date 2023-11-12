package Tank.Ex;

import javax.swing.*;
import java.awt.*;

/**
 * @author aj
 * @version 1.0
 * 如何在面板上画图
 */
//
public class DrawCircle extends JFrame {//JFrame 对应窗口，理解为一个画框
    //定义一个面板
    private MyPanel mp = null;
    public static void main(String[] args) {
        DrawCircle drawCircle = new DrawCircle();

    }
    public DrawCircle(){
        //初始化面板
        mp = new MyPanel();
        //放入画框
        this.add(mp);
        //设置窗口大小
        this.setSize(500,500);
        //点击 x ，退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getDefaultCloseOperation();
        this.setVisible(true);//可以显示
    }
}
//1. 先定义一个面板 MyPanel
class MyPanel extends JPanel {
    /*
    1. MyPanel对象就是一个面板
    2. Graphics 就是一支画笔
    Graphics g
     */
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类方法完成初始化
        //1. 绘制圆形
//        g.drawOval(100,100,200,200);
        //2. 绘制直线
//        g.drawLine(100,100,0,200);
//        g.drawArc(0,0,50,50,50,50);
        //3. 绘制矩形
//        g.drawRect(10,10,150,150);
        //4. 填充矩形
//        g.setColor(Color.blue);
//        g.fillRect(10,10,150,150);
        //5. 填充椭圆
//        g.setColor(Color.red);
//        g.fillOval(0,0,150,150);
        //6. 画图
       //  获取图片资源
//        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("baih.png"));
//        g.drawImage(image,10,10,1846 , 1123,this);
        //7. 画字符串 写字
        //给画笔设置颜色和字体
//        g.setColor(Color.black);
//        g.setFont(new Font("黑体",Font.BOLD,25));
//        g.drawString("重庆",50,50);
    }


}