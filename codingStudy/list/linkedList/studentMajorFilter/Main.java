package codingStudy.list.linkedList.studentMajorFilter;

import java.util.LinkedList;

public class Main {

    public static void solution(LinkedList<Student> students) {
        // 리스트 순회하며 전공이 전기전자인 학생 필터링 및 출력
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
