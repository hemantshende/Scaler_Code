package Prototype_Registry;

public class IntelligentStudent  extends  Student{
//    private static final Student Student = ;
    private int iq;

    public IntelligentStudent(String name, int age, String batch, int iq) {
        super(name, age, batch);
        this.iq = iq;
    }

    public IntelligentStudent(Student st, int iq) {
        super(st);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq=iq;
    }

    @Override
    public Student copy() {
        return new IntelligentStudent(this);
    }
}
