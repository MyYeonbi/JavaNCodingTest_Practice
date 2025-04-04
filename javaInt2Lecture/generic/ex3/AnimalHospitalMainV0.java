package javaInt2Lecture.generic.ex3;

import javaInt2Lecture.generic.animal.Cat;
import javaInt2Lecture.generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);

        // 개 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkup();

        //문제1: 개 병원에 고양이를 전달하는 법은?
       // dogHospital.set(cat);  // 다른 타입을 입력하면 컴파일 오류가 발생

        // 문제2 : 개 타입 변환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);


    }
}
