package Design_patterns.Creational_design_pattern.Prototype_Registry;

public class Client {
    public static void main(String[] args) {
        Student st=new Student("hemant",29, "Apr23");
        Student st2=st.copy();

//        this is copying the ref
//        Student st2=st1;

        StudentRegistry studentRegistry=new StudentRegistry();
        studentRegistry.fillRegistry();//prev defined content will be added

        Student st1=studentRegistry.get("Apr23");
        st1.setName("mohit");

    }
}
