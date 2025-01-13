package javaInt1Lecture.enumeration.ex2;

public class ClassGrade {
// BASIC, GOLD, DIAMOND는 ClassGrade 타입의 객체다.
// public static final: 상수로 선언되어 값이 변경되지 않고, 클래스 로드 시 생성되어 프로그램 전체에서 공유된다.

    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();
}
