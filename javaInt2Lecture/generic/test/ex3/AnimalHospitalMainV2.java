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
