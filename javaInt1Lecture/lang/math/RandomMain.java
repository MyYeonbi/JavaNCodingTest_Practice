package javaInt1Lecture.lang.math;

import java.util.Random;

public class RandomMain {

    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println("randomInt: " + randomInt);

        double randomDouble = random.nextDouble(); // 0.0d ~ 1.0d
        System.out.println("randomDouble: " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean: " + randomBoolean);


    }
}
