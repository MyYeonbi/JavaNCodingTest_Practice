package javaBasicLecture.static2.ex;

import javaBasicLecture.review.construct.Car;

public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        Car.showTotalCars(); // 구매한 차량 수를 출력하는 static 메서드

        /* 실행 결과
        차량 구입, 이름 : K3
        차량 구입, 이름 : G80
        차량 구입, 이름 : Model Y
        구매한 차량 수 : 3
         */
    }
    
}
