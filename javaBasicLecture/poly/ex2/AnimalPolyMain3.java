package javaBasicLecture.poly.ex2;

public class AnimalPolyMain3 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();

        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), };

        // 변하지 않는 부분
        for (Animal animal : animalArr) {
            extracted(animal);

        }



    }

    private static void extracted(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
