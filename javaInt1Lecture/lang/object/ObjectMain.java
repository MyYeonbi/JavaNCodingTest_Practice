package javaInt1Lecture.lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //toString은 Object클래스의 메서드
        String string = child.toString();
        System.out.println(string);

        /* < Object가 최상위 클래스로 설정된 이유 >
        Object는 모든 객체에 필요한 공통 기능을 제공한다.
        Object는 최상위 부모 클래스이기 때문에 모든 객체는 공통 기능을 편리하게 상속받을 수 잇따.
         - 공통 기능 제공 : 객체의 정보를 제공하고, 이 객체가 다른 객체와 같은지 비교하고,
         객체가 어떤 클래스로 만들어졌는지 확인하는 기능은 기본 기능이다.
         이런 정보를 제공하는 메서드는 공통이름으로 되어야 개발자들끼리 헷갈리지 않기 때문에 Object에서 설정된것.

         - Object가 제공하는 기능 :
         1) 객체의 정보를 제공하는 toString();
         2) 객체의 같음을 비교하는 equals();
         3) 객체의 클래스 정보를 제공하는 getClass();
         4) 기타 여러가지 기능


         */
    }
}
