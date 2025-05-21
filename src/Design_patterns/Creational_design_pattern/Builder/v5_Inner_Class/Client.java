package Design_patterns.Creational_design_pattern.Builder.v5_Inner_Class;

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

//        Student student=new Student(studentBuilder);

        System.out.println(student.toString());
    }
}