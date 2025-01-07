package javaInt1Lecture.lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {

        ImmutableAddress a = new Address("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을수 있는 방법은 없다.
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); //b의 값을 부산으로 변경해야함.
        System.out.println("---- 부산 -> b ----");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
