package javaInt1Lecture.enumeration.ex2;

public class ClassGrade {
// BASIC, GOLD, DIAMOND는 ClassGrade 타입의 객체다.
// public static final: 상수로 선언되어 값이 변경되지 않고, 클래스 로드 시 생성되어 프로그램 전체에서 공유된다.

    /*이것을 타입 열거형 패턴이라고 한다.
    클래스 정의해서 이 클래스의 타입만 사용하도록 한다.  */
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    //private 생성자 추가
    private ClassGrade() {}
}
