package javaBasicLecture.ref;

public class Example {
    public static void main(String[] args) {
        int[] arr = {10};  // 참조형 변수 arr
        modifyArray(arr);
        System.out.println(arr[0]);  // arr[0]은 20으로 변경됨
    }
    public static void modifyArray(int[] arr) {
        arr[0] = 20; // 복사된 참조를 통해 원본 배열을 수정
    }
}
