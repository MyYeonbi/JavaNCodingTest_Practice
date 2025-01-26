package codingStudy.list.linkedList.studentMajorFilter;

import java.util.LinkedList;
public class Student {
   String name;
   String major;

   public Student(String name, String major) {
       this.name = name;
       this.major = major;
   }

   //getter 메서드
    public String getName() {
       return name;
    }

    public String getMajor() {
       return major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "이름 = '" + name + '\'' +
                ", 전공 = '" + major + '\'' +
                '}';
    }
}
