package Tank.Ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @author aj
 * @version 1.0
 */

// 小球通过键盘控制上下左右移动
    //Java事件控制
public class BallMove extends JFrame {
    BallPanel ballPanel = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();

    }

    public BallMove(){
        ballPanel = new BallPanel(10,10);
        this.add(ballPanel);
        this.setSize(500,500);
        this.addKeyListener(ballPanel);//将键盘监听加入 JFrame （在ballPanel 上 发生的 键盘事件）
        this.setDefaultCloseOperation(BallMove.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
//KeyListener 是监听器，可以监听键盘事件
class BallPanel extends JPanel implements KeyListener {
    private int x;
    private int y;

    public BallPanel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);
        g.fillOval(x,y,20,20);
    }
//监听字符   有字符输出时，该方法就会触发
    @Override
    public void keyTyped(KeyEvent e) {

    }
// 当键盘 某个键 按下 该方法触发
    @Override
    public void keyPressed(KeyEvent e) {
//        System.out.println((char)e.getKeyCode() + "触发");
        if(e.getKeyCode() == KeyEvent.VK_DOWN){ // 当键盘 向下键 按下时
           y++;
           this.repaint();
        }else if(e.getKeyCode() == KeyEvent.VK_UP){
            y--;
            this.repaint();
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
            this.repaint();
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
            this.repaint();
        }

    }
//当键盘 某个键 松开 该方法触发
    @Override
    public void keyReleased(KeyEvent e) {

    }
}