package Tank.TankGame02;

import javax.swing.*;
import java.awt.*;

/**
 * @author aj
 * @version 1.0
 */
public class TankGame02 extends JFrame {
    //定义一个MyPanel
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame02 tankGame01 = new TankGame02();
    }

    public TankGame02() throws HeadlessException {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(TankGame02.EXIT_ON_CLOSE);
        this.addKeyListener(myPanel);
        this.setVisible(true);

    }
}
