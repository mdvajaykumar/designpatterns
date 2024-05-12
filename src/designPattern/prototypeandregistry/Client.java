package designPattern.prototypeandregistry;

public class Client {
    public static final String APR_22 = "APR_22";
    public static final String INTELLIGENT_APR_22 = "INTELLIGENT_APR_22";
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student roshan = studentRegistry.get(APR_22).clone();
        roshan.setAge(25);
        roshan.setEmail("abc@xyz.com");
        roshan.setName("Roshan");
        roshan.setPsp(95);

//        System.out.println(roshan);

        Student intelligentVikramStudent = studentRegistry.get(INTELLIGENT_APR_22).clone();
        intelligentVikramStudent.setPsp(75);
        intelligentVikramStudent.setName("Vikram");
        intelligentVikramStudent.setEmail("test@xyz.com");

//        System.out.println(intelligentVikramStudent );


    }

    private static void fillRegistry(StudentRegistry studentRegistry) {

        Student  apr22 = new Student();
        apr22.setBatch("Apr 22");
        apr22.setAvgBatchPsp(89.88);
        studentRegistry.register(APR_22, apr22);


        IntelligentStudent intelligentApr22Student= new IntelligentStudent();
        intelligentApr22Student.setBatch("Apr 22");
        intelligentApr22Student.setAvgBatchPsp(89.88);

        studentRegistry.register(INTELLIGENT_APR_22, intelligentApr22Student);


    }
}
