package javaInt1Lecture.lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println("randomInt: " + randomInt);
    }
}
