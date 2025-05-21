package Design_patterns.Creational_design_pattern.Builder.v0_basic;

public class Client {
    public static void main(String[] args) {

        StudentBuilder studentBuilder=new StudentBuilder();
        studentBuilder.setAge(25);
        studentBuilder.setfName("abc");
        studentBuilder.setlName("xyz");
        studentBuilder.setEmail("abc@xyz");

        Student student=new Student(studentBuilder);

        System.out.println(student.toString());
    }
}
