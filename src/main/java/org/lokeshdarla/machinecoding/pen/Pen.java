package org.lokeshdarla.machinecoding.pen;

import java.awt.*;

abstract public class Pen {
    private PenType penType;
    private Mechanism mechanism;
    private PenState penState;

    public Pen(PenType penType, Mechanism mechanism) {
        this.penType = penType;
        this.mechanism = mechanism;
        this.penState = PenState.CLOSED;
    }

    public void write() {
        if (this.penState == PenState.OPEN) {
            System.out.println("Writing with " + penType + " pen.");
        } else {
            System.out.println("Open the pen first.");
        }
    }

    public void open() {
        this.penState = PenState.OPEN;
        System.out.println("Pen is now open.");
    }

    public void close() {
        this.penState = PenState.CLOSED;
        System.out.println("Pen is now closed.");
    }
}
