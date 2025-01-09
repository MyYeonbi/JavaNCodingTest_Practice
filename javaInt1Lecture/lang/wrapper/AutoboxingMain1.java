package javaInt1Lecture.lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxingValue = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxedValue = boxingValue.intValue();

        System.out.println("boxingValue = " + boxingValue);
        System.out.println("Value of unboxed value is " + unboxedValue);
    }
}
