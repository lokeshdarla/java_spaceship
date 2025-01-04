package org.lokeshdarla.machinecoding.pen;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Refill blueRefill = new Refill(InkColor.BLUE);
        GelPen gelPen = new GelPen(Mechanism.BUTTON, blueRefill);

        System.out.println("Using a Gel Pen with " + gelPen.getRefill().getColor() + " ink.");
        gelPen.open();
        gelPen.write();
        gelPen.close();
    }
}
