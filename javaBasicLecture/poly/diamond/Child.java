package javaBasicLecture.poly.diamond;

public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Child methodA");
    }

    @Override
    public void methodCommon() {
        System.out.println("Child methodCommonA");
    }

    @Override
    public void methodB() {
        System.out.println("Child methodB");
    }
}
