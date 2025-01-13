package javaInt1Lecture.enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        //ClassGrade.BASIC.getClass(): BASIC 객체의 런타임 클래스 정보를 반환.
        System.out.println("class BASIC = "+ ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = "+ ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = "+ ClassGrade.DIAMOND.getClass());
    }
}
