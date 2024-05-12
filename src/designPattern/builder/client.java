package designPattern.builder;

public class client {


    public static void main(String[] args) {

        Student s1= Student.createBuilder().
                setfName("ajay").
                setlName("kumar").
                setGender("male").
                setPsp(18.0).
                setWeight(38.0).
                build();
      }

}
