package Tank.TankGame01;

/**
 * @author aj
 * @version 1.0
 */
public class Tank {
    private int direct;
    private int type;

    private int x;//坦克的横坐标
    private int y;//坦克的纵坐标

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Tank(int x, int y, int direct, int type) {
        this.direct = direct;
        this.type = type;
        this.x = x;
        this.y = y;
    }
}
