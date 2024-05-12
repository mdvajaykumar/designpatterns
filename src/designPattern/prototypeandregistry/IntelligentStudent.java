package designPattern.prototypeandregistry;

public class IntelligentStudent extends Student{
    private int iq;

    //Note: Always make sure that child classes override the clone method.
    //Else client might get object with partial data

    public IntelligentStudent(){}

    public IntelligentStudent (IntelligentStudent originalStudent){
//        super(originalStudent);
        this.iq = originalStudent.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }


}
