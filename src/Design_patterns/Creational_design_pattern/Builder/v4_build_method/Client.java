package Design_patterns.Creational_design_pattern.Builder.v4_build_method;

public class Client {
    public static void main(String[] args) {

//        StudentBuilder studentBuilder=new StudentBuilder();
        Student student=
                Student.getBuilder()
                        .setAge(25)
                        .setfName("abc")
                        .setlName("xyz")
                        .setEmail("abc@xyz")
                        .build();

//        Student student1=new Student(studentBuilder);

        System.out.println(student.toString());
    }
}