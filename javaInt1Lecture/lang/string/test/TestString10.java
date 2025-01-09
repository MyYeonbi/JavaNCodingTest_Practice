package javaInt1Lecture.lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "appple, banana, mango";

        //분리하기
        String[] splitFruits = fruits.split(",");
        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }

        //합치기
        String joinString = String.join("->", splitFruits);
        System.out.println("joinString: " + joinString);

    }
}
