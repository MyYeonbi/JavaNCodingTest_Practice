package javaBasicLecture.poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; // 다운캐스팅
        child1.childMethod();
    }
}
