package lld.src.main.java.org.lokeshdarla.designpatterns.flyweight;

public class BulletInstance {
    private final Bullet bullet;
    private final int x;
    private final int y;
    private final int velocity;

    public BulletInstance(Bullet bullet, int x, int y, int velocity) {
        this.bullet = bullet;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
    }

    public void display() {
        System.out.println("Bullet Instance: " +
                "Intrinsic = " + bullet +
                ", Extrinsic (x, y, velocity) = (" + x + ", " + y + ", " + velocity + ")");
    }
}
