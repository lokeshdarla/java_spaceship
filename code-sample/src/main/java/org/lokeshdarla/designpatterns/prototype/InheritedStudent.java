package org.lokeshdarla.designpatterns.prototype;

public class InheritedStudent extends Student {
    private  int iq;

    InheritedStudent (){

    }

    public InheritedStudent(InheritedStudent student) {
        super(student);
        this.iq = student.iq;
    }

    public void  setIq(int iq) {
        this.iq = iq;
    }

    public int getIq() {
        return this.iq;
    }

    @Override
    public InheritedStudent clone() {
        return  new InheritedStudent(this);
    }

}
