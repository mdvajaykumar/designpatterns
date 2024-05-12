package designPattern.builder;



public class Student {
    private String fName;
    private String lName;
    private String gender;
    private double psp;
    private double weight;

    private Student(Builder builder) {
        this.fName = builder.getfName();
        this.lName = builder.getlName();
        this.gender = builder.getGender();
        this.psp = builder.getPsp();
        this.weight = weight;
    }

    public static Builder createBuilder(){
        return new Builder();
    }


    public static  class Builder{

        private String fName;
        private String lName;
        private String gender;
        private double psp;
        private double weight;
        public String getfName() {
            return fName;
        }

        public boolean validate(){
//            we can perform validation here
            return true;
        }


        public Student  build(){
//            if(validate()){
//                 check validation here
//            }
            return new Student(this);
        }
        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public String getlName() {
            return lName;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public double getWeight() {
            return weight;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }


    }

}
