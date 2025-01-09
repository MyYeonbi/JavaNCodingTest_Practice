package javaInt1Lecture.lang.wrapper;

public class MyIntegerMethodMain0 {

    public static void main(String[] args) {
        int value = 10;
        int i1 = compareTo(value, 5);
        System.out.println("i1 =" + i1);

        int i2 = compareTo(value, 10);
        System.out.println("i2 =" + i2);

        int i3 = compareTo(value, 20);
        System.out.println("i3 =" + i3);
    }

    /* value값을 외부 메서드를 이용하여 비교. 항상 자기 자신의 값인 value가 사용됨.
    만약 value가 객체라면 value 객체 스스로 자기 자신의 값과 다른 값을 비교하는 메서드를 만드는것이 더 유용할 것.
    
     */

    public static int compareTo(int value, int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }
}
