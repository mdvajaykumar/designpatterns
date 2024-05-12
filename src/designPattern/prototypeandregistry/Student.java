package designPattern.prototypeandregistry;

import lombok.Data;
import lombok.Setter;

@Setter
@Data
public class Student implements Prototype<Student> {
    private int age;
    private double psp;
    private String email;
    private String name;

    //this are common attributes

    private String batch;
    private double avgBatchPsp;
     public Student(){

     }
    public Student(Student originalStudent){

        this.name = originalStudent.name;
        this.age = originalStudent.age;
        this.psp = originalStudent.psp;
        this.email = originalStudent.email;
        this.batch = originalStudent.batch;
        this.avgBatchPsp = originalStudent.avgBatchPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
