package javaInt1Lecture.lang.wrapper;

public class AutoboxingMain1 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxingValue = value; //오토 박싱(Auto-boxing)

        // Wrapper -> Primitive
        int unboxedValue = boxingValue.intValue();

        System.out.println("boxingValue = " + boxingValue);
        System.out.println("Value of unboxed value is " + unboxedValue);
    }
}
