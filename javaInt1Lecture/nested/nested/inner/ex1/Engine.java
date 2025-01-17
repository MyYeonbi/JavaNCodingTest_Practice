package javaInt1Lecture.nested.nested.inner.ex1;

import javaBasicLecture.extends1.ex2.Car;

//Car에서만 사용
public class Engine {

    private Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public void start() {
        System.out.println("충전 레벨 확인: car.getChargeLevel()" + car.getChargeLevel());
        System.out.println(car.getModel() + "의 엔진을 구동합니다.");
    }
}
