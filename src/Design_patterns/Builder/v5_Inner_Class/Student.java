package Design_patterns.Builder.v5_Inner_Class;

public class Student {
    private String fName;
    private String lName;
    private int age;
    private String email;
    private int std;
    private String division;
    private int gradYear;
    private String city;

//    private Student(StudentBuilder studentBuilder){  //passing builder obj to original student class..
//        this.age=studentBuilder.getAge();
//        this.fName=studentBuilder.getfName();
//        this.lName=studentBuilder.getlName();
//        this.email=studentBuilder.getEmail();
//    }


    public Student(String fName, String lName, int age, String email, int std, String division, int gradYear, String city) {
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.email = email;
        this.std = std;
        this.division = division;
        this.gradYear = gradYear;
        this.city = city;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStd() {
        return std;
    }

    public void setStd(int std) {
        this.std = std;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", std=" + std +
                ", division='" + division + '\'' +
                ", gradYear=" + gradYear +
                ", city='" + city + '\'' +
                '}';
    }

    //added this method to modify the code
    public static StudentBuilder getBuilder(){  //important
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        private String fName;
        private String lName;
        private int age;
        private String email;
        private int std;
        private String division;
        private int gradYear;
        private String city;

        public StudentBuilder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public StudentBuilder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentBuilder setStd(int std) {
            this.std = std;
            return this;
        }

        public StudentBuilder setDivision(String division) {
            this.division = division;
            return this;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

//        public StudentBuilder setCity(String city) {
//            this.city = city;
//            return this;
//        }

        public Student build(){
            return new Student(fName,lName,age,email,std,division,gradYear,city);
        }
    }
}