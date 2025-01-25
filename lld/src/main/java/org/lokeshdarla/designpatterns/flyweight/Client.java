package lld.src.main.java.org.lokeshdarla.designpatterns.flyweight;

public class Client {
    public static void main(String[] args) {
        Bullet rifleBullet = Bullet.getBullet("Rifle", "Metallic");
        Bullet shotgunShell = Bullet.getBullet("Shotgun", "Plastic");

        BulletInstance bullet1 = new BulletInstance(rifleBullet, 10, 20, 300);
        BulletInstance bullet2 = new BulletInstance(rifleBullet, 15, 25, 300);
        BulletInstance bullet3 = new BulletInstance(shotgunShell, 5, 10, 200);

        bullet1.display();
        bullet2.display();
        bullet3.display();

        // Checking shared instances
        // make the bullet public to check
        // System.out.println("Are rifle bullets shared? " + (bullet1.bullet ==
        // bullet2.bullet));

    }
}
