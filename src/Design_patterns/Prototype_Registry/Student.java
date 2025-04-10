package Design_patterns.Prototype_Registry;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String batch;

    public Student(String name,int age,String batch) {
        this.name = name;
        this.age=age;
        this.batch=batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    //copy constructor
    Student(Student st){
        this.age=st.age;
        this.name=st.name;
    }

    @Override
    public Student copy() {
        return new Student(this);
    }

}
