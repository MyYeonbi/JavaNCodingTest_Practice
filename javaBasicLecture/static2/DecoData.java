package javaBasicLecture.static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // instaceValue++; 인스턴스 변수 접근은 compile error을 일으킨다.
        // instanceMethod(); 인스턴스 메서드 접근은 compile error을 일으킨다.
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근

    }

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++; //static이 없는 메서드는 인스턴스 변수 접근 가능!
        instanceMethod(); // 인스턴스 메서드도 당연히 접근 가능!

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue"+ instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue"+ staticValue);
    }


}
