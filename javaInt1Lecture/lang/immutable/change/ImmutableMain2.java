package javaInt1Lecture.lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 =new ImmutableObj(10);
    obj1.add(20); // 꼭 반환값을 반환해야지 이것이 적용이 된다. 

        // 계산 이후에도 기존값과 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue());

    }
}
