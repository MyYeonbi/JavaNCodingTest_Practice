package javaBasicLecture.poly.basic;

// upcasting vs downcasting
public class CastingMain3 {

    Child child = new Child();
    Parent parent1 = new Child();

    Parent parent2 = (Parent) Child(); // 업캐스팅은 생략 가능. 생략 권장
}
