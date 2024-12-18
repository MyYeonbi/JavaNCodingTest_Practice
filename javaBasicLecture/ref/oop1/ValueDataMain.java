package javaBasicLecture.ref.oop1;

public class ValueDataMain {
    public static void main(String[] args) {
        ValueData valueData = new ValueData();
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
    static void add(ValueData valueData){
        valueData.value++;
        System.out.println("숫자 증가 value = " + valueData.value);
    }
}
