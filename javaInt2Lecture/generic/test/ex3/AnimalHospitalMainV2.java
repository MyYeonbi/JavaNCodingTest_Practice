package javaInt2Lecture.generic.test.ex3;

import javaInt2Lecture.generic.animal.Cat;
import javaInt2Lecture.generic.animal.Dog;

public class AnimalHospitalMainV2 {

    public static void main(String[] args) {
        AnimalHospitalV2 <Dog> dog = new AnimalHospitalV2<>();
        AnimalHospitalV2 <Cat> cat = new AnimalHospitalV2<>();
        AnimalHospitalV2 <Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2 <Integer> integerHospital = new AnimalHospitalV2<>();
    }
}
/*
* 문제 :
* - 제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다.
* 따라서 타입 매개변수를 어떤 타입이든 수용할 수 있는 Object로 가정하고, Object의 기능만 사용할 수 있다.
* */