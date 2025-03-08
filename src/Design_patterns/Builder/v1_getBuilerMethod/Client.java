package Design_patterns.Builder.v1_getBuilerMethod;

public class Client {
    public static void main(String[] args) {

//        StudentBuilder studentBuilder=new StudentBuilder();
        StudentBuilder studentBuilder=Student.getBuilder(); //called getbuilder();
        studentBuilder.setAge(25);
        studentBuilder.setfName("abc");
        studentBuilder.setlName("xyz");
        studentBuilder.setEmail("abc@xyz");

        Student student=new Student(studentBuilder);

        System.out.println(student.toString());
    }
}