package javaInt1Lecture.enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        //ClassGrade.BASIC.getClass(): BASIC 객체의 런타임 클래스 정보를 반환.
        System.out.println("class BASIC = "+ ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = "+ ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = "+ ClassGrade.DIAMOND.getClass());
    }
}/*코드의 핵심 과정 요약
	1.	ClassGrade 클래스가 로드될 때, BASIC, GOLD, DIAMOND 상수 필드가 ClassGrade 객체로 각각 초기화된다.
	2.	ClassRefMain의 main 메서드에서 각 상수 객체의 클래스 타입 정보를 출력한다.
	3.	출력 결과를 통해 모든 상수 객체는 동일하게 ClassGrade 클래스의 인스턴스임을 알 수 있다.
*/
