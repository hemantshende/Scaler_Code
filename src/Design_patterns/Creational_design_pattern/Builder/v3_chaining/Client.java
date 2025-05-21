package Design_patterns.Creational_design_pattern.Builder.v3_chaining;

public class Client {
    public static void main(String[] args) {

//        StudentBuilder studentBuilder=new StudentBuilder();
        StudentBuilder studentBuilder=
                Student.getBuilder()
                        .setAge(25)
                        .setfName("abc")
                        .setlName("xyz")
                        .setEmail("abc@xyz");

        Student student=new Student(studentBuilder);

        System.out.println(student.toString());
    }
}