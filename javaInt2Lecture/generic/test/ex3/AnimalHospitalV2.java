package javaInt2Lecture.generic.test.ex3;




public class AnimalHospitalV2 <T> {

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용.
        //그래서 메서드는 항상 Object의 기능인 메서드들만 호출 가능하다. 
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public T bigger(Animal target) {

        return animal.getSize() > target.getSize() ? animal : target;
    }
}
