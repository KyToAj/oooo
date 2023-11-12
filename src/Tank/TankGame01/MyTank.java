package Tank.TankGame01;

/**
 * @author aj
 * @version 1.0
 */
public class MyTank extends Tank{

    public MyTank(int x, int y) {
        super(x, y);
    }

    public MyTank(int x, int y, int direct, int type) {
        super(direct, type, x, y);
    }
}
