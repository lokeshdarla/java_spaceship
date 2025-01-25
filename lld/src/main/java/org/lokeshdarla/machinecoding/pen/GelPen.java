package lld.src.main.java.org.lokeshdarla.machinecoding.pen;

public class GelPen extends Pen {
    private Refill refill;

    public GelPen(Mechanism mechanism, Refill refill) {
        super(PenType.GEL, mechanism);
        this.refill = refill;
    }

    public Refill getRefill() {
        return refill;
    }
}
