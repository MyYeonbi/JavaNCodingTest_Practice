package codingStudy.list.linkedList.studentMajorFilter;

import java.util.LinkedList;

public class Main {

    public static void solution(LinkedList<Student> students) {
       /* 학생명과 전공이 추가된 LinkedList를 매개변수로 하여
       for문을 통해 이 리스트를 순회한다. 그리고 getMajor인 get메서드를 불러와서
       "전기전자"라는 문구와 일치하는지를 조건으로 하여 출력하게 만든다. 
        */
        for (Student student : students) {
            if (student.getMajor().equals("전기전자")) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();

        // 학생 추가
        students.add(new Student("문준일", "전기전자"));
        students.add(new Student("정지희", "소프트웨어"));
        students.add(new Student("최규찬", "전기전자"));
        students.add(new Student("김이수", "산업디자인"));
        students.add(new Student("임준수", "전기전자"));

        // 전공이 "전기전자"인 학생 출력
        System.out.println("전공이 전기전자인 학생 목록 : ");
        solution(students);
    }
}
