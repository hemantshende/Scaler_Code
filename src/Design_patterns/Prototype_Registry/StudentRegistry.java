package Design_patterns.Prototype_Registry;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String,Student> students;

    StudentRegistry(){
        students=new HashMap<>();
    }

    public void add(String key, Student student){
        students.put(key,student);
    }

    public void remove(String key){
        students.remove(key);
    }

    //when clients want object of particular key
    //then we will create copy() of that key and return
    public Student get(String key){
       return students.get(key).copy();
    }

    //to fill dummy objects
    public void fillRegistry(){
        Student apr23Student=new Student("new st", 23,"Apr23");
        Student Mar23Student=new Student("new st", 23,"Mar23");
        Student Feb23Student=new Student("new st", 23,"Feb23");

        students.put("Apr23", apr23Student);
        students.put("Mar23", Mar23Student);
        students.put("Feb23", Feb23Student);
    }
}
