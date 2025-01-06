package javaInt1Lecture.lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object o = dog;

        action(dog);
        /*obj instanceof Dog dog가 true가 되는 이유는 obj가 실제로 Dog 객체를 참조하고 있기 때문입니다.
이것은 Object obj = dog; 또는 Object obj = new Dog();와 같은 업캐스팅(자식 객체를 부모 타입으로 참조) 때문
*/
        action(car);
    }
    private static void action(Object obj) {
     // obj.sound(); // 컴파일 오류. Object는 sound()가 없음
     // obj.move();

     // 객체에 맞는 다운 캐스팅 필요
     if(obj instanceof Dog dog) {
         // Dog dog = (Dog) obj ;
         // java 16이상 조건문 확인이 완료되면, Dog 타입으로 자동으로 다운 캐스팅된 변수 dog가 생성된다.
         dog.sound();
     } else if (obj instanceof Car car) {
         car.move();
     }
    }
}
/* 1. Object는 모든 타입의 부모이다. 부모는 자식을 담을 수 있으므로 앞의 코드를 다음과 같이 변경 가능하다.
Object dog = new Dog(); // Dog -> Object
Object car = new Car(); // Car -> Object

<Object 다형성의 장점>
action(Object obj)메서드를 분석해보자.
이 메서드는 Object 타입의 매개변수를 사용.그런데 Object는 모든 객체의 부모이다.
따라서 어떤 객체든지 인자로 전달할 수 있다.
action(dog) //main에서 dog전달
void action(Object obj = dog(Dog)) // Object는 자식 Dog 타입 참조 가능.


<Object 다형성의 한계>
action(dog) //main에서 dog전달
private static void action(Object obj) {
   obj.sound(); // 컴파일 오류. Object는 sound()가 없다.
   매개변수인 Object는 자식 타입을 참조는 가능해도(업캐스팅), Object 타입으로 선언된 변수는 Object 클래스에 정의된 메서드만 호출할 수 있다.그래서 다운캐스팅이 필요한것.
}
 */
