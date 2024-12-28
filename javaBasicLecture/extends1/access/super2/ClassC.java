package javaBasicLecture.extends1.access.super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10,20);
        /* ClassB는 생성자를 개발자가 만들었기 때문에 기본 생성자가 자동으로 만들어지지 않는다.
        그래서, super();를 생략해서는 안된다.
         */
        System.out.println("ClassC 생성자 ");
    }
}
