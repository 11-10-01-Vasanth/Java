package Collection;
import java.util.*;
class Student{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // public void setName(String name){
    //     name = this.name;
    // } 
    public String getName(){
        return name;
    }
    // public void setAge(int age){
    //     age = this.age;
    // }
    public int getAge(){
        return age;
    }
}

public class ListClass {
    List<Student> l = new ArrayList<>();
    Student s1 = new Student("Vasanth", 23);
    Student s2 = new Student("Vasanth", 23);
    Student s3 = new Student("Vasanth", 23);
    l.add(s1);
    // li.add(s1);
    // System.out.println(li);
}
