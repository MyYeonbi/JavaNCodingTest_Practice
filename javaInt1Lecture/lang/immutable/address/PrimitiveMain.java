package javaInt1Lecture.lang.immutable.address;

public class PrimitiveMain {
    public static void main(String[] args) {
        //기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a; // a->b 값 복사 후 대입
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 20;
        System.out.println("--- 20 -> b -----");
        System.out.println("a = " + a);
        System.out.println("b = "+ b);
        /* 이렇게 나온건 b는 a의 값을 복사해서 대입했었기 때문이다.
        그래서 동일한 10이 아닌것이다. 하나의 값을 공유하지 않는다는 말이다.
        b= 20을 대입하였을때 서로 공유하지 않기 때문에 a는 여전히 10인것. 
         */

    }
}
