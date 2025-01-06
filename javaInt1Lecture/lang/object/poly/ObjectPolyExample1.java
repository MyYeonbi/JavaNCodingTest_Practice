package javaInt1Lecture.lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object o = dog;

        action(dog);
        action(car);
    }
    private static void action(Object obj) {
     // obj.sound(); // 컴파일 오류. Object는 sound()가 없음
     // obj.move();

     // 객체에 맞는 다운 캐스팅 필요
     if(obj instanceof Dog dog) {
         dog.sound();
     }
    }
}
