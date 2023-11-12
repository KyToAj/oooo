package Tank.TankGame01;

import javax.swing.*;
import java.awt.*;

/**
 * @author aj
 * @version 1.0
 */
public class TankGame01 extends JFrame {
    //定义一个MyPanel
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }

    public TankGame01() throws HeadlessException {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(TankGame01.EXIT_ON_CLOSE);
        this.addKeyListener(myPanel);
        this.setVisible(true);

    }
}
