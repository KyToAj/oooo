package Tank.TankGame02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @author aj
 * @version 1.0
 * 坦克大战绘图区
 */
public class MyPanel extends JPanel implements KeyListener {
    //定义一个坦克
    MyTank myTank = null;
    Vector<EnemyTank> aTank = new Vector<>();
    int enemyTankSize = 3;
//    AdversaryTank aTank =null;
    public MyPanel(){
        //初始化一个坦克
//        myTank = new MyTank(100,100);
        myTank = new MyTank(100,100);
        for (int i = 0; i <enemyTankSize ; i++) {
            aTank.add(new EnemyTank(100 * (i + 1),0));
            aTank.get(i).setDirect(2);
        }
    }
    @Override
    public void paint(Graphics g)  {
        super.paint(g);
        g.fillRect(0,0,1000,750);
//        drawTank(myTank.getX(), myTank.getY(), g,3,0);
//        drawTank(myTank.getX() + 100, myTank.getY() + 100, g,1,1);
        drawTank(myTank.getX(), myTank.getY(),g, myTank.getDirect(),myTank.getType() );//我方坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = aTank.get(i);
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),1);
        }
    }

    /**
     *
     * @param x  坦克的 x坐标
     * @param y  坦克的 y坐标
     * @param g  画笔
     * @param direct    方向
     * @param type  坦克类 型
     */
    public void drawTank(int x ,int y ,Graphics g ,int direct ,int type){
      switch (type){
          case 0://我们的坦克
              g.setColor(Color.cyan);
              break;
          case 1://敌人的坦克
              g.setColor(Color.yellow);
              break;
      }
      //根据坦克的方向绘制坦克
        switch (direct){
            case 0://向上
//                g.draw3DRect(x, y, 10,60,false);
                g.fill3DRect(x,y, 10,60,false);
                g.fill3DRect(x+10,y+10,20,40,false);
                g.fill3DRect(x+30,y,10,60,false);
                g.fillOval(x+10,y+20,20,20);
                g.drawLine(x+20,y,x+20,y+30);
                break;
            case 1: // 左
//
                g.fill3DRect(x, y, 60, 10, false);
                g.fill3DRect(x+10, y+10, 40, 20, false);
                g.fill3DRect(x, y+30, 60, 10, false);
                g.fillOval(x+20, y+10, 20, 20);
                g.drawLine(x, y+20, x+30, y+20);
                break;
            case 2: //下
                g.fill3DRect(x, y, 10, 60, false);         // 坦克身体
                g.fill3DRect(x + 10, y + 10, 20, 40, false); // 坦克炮台
                g.fill3DRect(x + 30, y, 10, 60, false);     // 坦克身体
                g.fillOval(x + 10, y + 20, 20, 20);        // 坦克盖子
                g.drawLine(x + 20, y + 60, x + 20, y + 30); // 坦克炮管

                break;

            case 3: // 右
                g.fill3DRect(x, y, 60, 10, false);         // 坦克身体
                g.fill3DRect(x + 10, y + 10, 40, 20, false); // 坦克炮台
                g.fill3DRect(x, y + 30, 60, 10, false);     // 坦克身体
                g.fillOval(x + 20, y + 10, 20, 20);        // 坦克盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20); // 坦克炮管朝右

                break;

        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_W){//上
            myTank.setDirect(0);
//            myTank.setY(myTank.getY() - 2);
            myTank.TankUp();
            this.repaint();
        }else if(e.getKeyCode() == KeyEvent.VK_A){//左
            myTank.setDirect(1);
//            myTank.setX(myTank.getX() - 2);
            myTank.TankLeft();
            this.repaint();
        }else if(e.getKeyCode() == KeyEvent.VK_S){//下
            myTank.setDirect(2);
//            myTank.setY(myTank.getY() + 2);
            myTank.TankDown();
            this.repaint();
        }else if(e.getKeyCode() == KeyEvent.VK_D){//右
            myTank.setDirect(3);
//            myTank.setX(myTank.getX() + 2)
            myTank.TankRight();
            this.repaint();
            //更换颜色
        }else if(e.getKeyCode() == KeyEvent.VK_1){
            myTank.setType(0);
            this.repaint();
        }else if(e.getKeyCode() == KeyEvent.VK_2){
            myTank.setType(1);
            this.repaint();
        }else if(e.getKeyCode() == KeyEvent.VK_PERIOD){ //加速
            myTank.setSpeedUp();
        }else if(e.getKeyCode() == KeyEvent.VK_COMMA){  //减速
            myTank.setSpeedDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
