package lld.src.main.java.org.lokeshdarla.designpatterns.prototype;

public class Student implements Prototype {
    private String name;

    private int age;

    private int psp;

    private String batchName;

    private double averageBatchpsp;

    Student() {
    }

    Student(Student student) {
        this.setName(student.name);
        this.setAge(student.age);
        this.setPsp(student.psp);
        this.setBatchName(student.batchName);
        this.setAverageBatchpsp(student.averageBatchpsp);
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void setAverageBatchpsp(double averageBatchpsp) {
        this.averageBatchpsp = averageBatchpsp;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getPsp() {
        return this.psp;
    }

    public String getBatchName() {
        return this.batchName;
    }

    public double getAverageBatchpsp() {
        return this.averageBatchpsp;
    }

}
