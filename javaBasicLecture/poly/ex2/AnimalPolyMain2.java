package javaBasicLecture.poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {

        Animal caw = new Caw();


        Animal[] animalArr = {new Dog(), new Cat(), caw, };

        // 변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");

        }



    }



}
