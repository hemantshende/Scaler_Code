package AdvanceDSA_2.Sorting_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparable implements Comparable<StudentComparable>{
    String name;
    int age;
    public StudentComparable(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public int compareTo(StudentComparable other) {//sorting on the basis of age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {//to print
        return name+" "+age;
    }

    public static void main(String[] args) {
        List<StudentComparable> student=new ArrayList<>();
        student.add(new StudentComparable("a",25));
        student.add(new StudentComparable("b",29));
        student.add(new StudentComparable("c",24));

        Collections.sort(student);
        System.out.println(student);
    }
}
