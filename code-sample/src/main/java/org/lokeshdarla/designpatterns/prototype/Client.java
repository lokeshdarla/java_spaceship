package org.lokeshdarla.designpatterns.prototype;

public class Client {
    public static  void fillRegistrary(StudentRegistry studentRegistry) {
        Student student=new Student();
        student.setBatchName("December2024");
        student.setAverageBatchpsp(92.3);

        studentRegistry.registerStudent(student.getBatchName(),student);

        InheritedStudent inheritedStudent=new InheritedStudent();
        inheritedStudent.setBatchName("DecemberInherited2024");
        inheritedStudent.setAverageBatchpsp(98);
        inheritedStudent.setIq(180);

        studentRegistry.registerStudent(inheritedStudent.getBatchName(),inheritedStudent);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistrary(studentRegistry);

        Student student=studentRegistry.getStudent("December2024");
        Student lokesh=student.clone();
        lokesh.setName("lokesh");
        lokesh.setAge(21);
        lokesh.setPsp(90);

        Student inheritedStudent=studentRegistry.getStudent("DecemberInherited2024").clone();
        inheritedStudent.setName("IntelligentLokesh");
        inheritedStudent.setAge(20);
        inheritedStudent.setPsp(90);

        System.out.println(student);
    }
}
