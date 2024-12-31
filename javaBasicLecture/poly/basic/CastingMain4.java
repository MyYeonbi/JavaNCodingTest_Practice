package javaBasicLecture.poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1; // 다운캐스팅
        child1.childMethod(); // 문제 없음

        /*Parent parent2 = new Parent();
        Child child2 = (Child) parent2;
        child2.childMethod();
         이건 런타임 오류인데 매우 안좋은 오류이다.
         왜냐하면 보통 고객이 해당 프로그램을 실행하는 도중에 발생하기 때문이다.
         */
    }
}
