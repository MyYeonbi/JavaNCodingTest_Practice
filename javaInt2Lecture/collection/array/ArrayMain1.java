package javaInt2Lecture.collection.array;

import java.util.Arrays;

public class ArrayMain1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        //index 입력 : O(1)
        System.out.println("== index 입력 : 0(1) ==");
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        System.out.println(Arrays.toString(arr));

        //index 변경 : 0(1)
        System.out.println("== index 변경: 0(1) ==");
        arr[2]= 10;
        System.out.println(Arrays.toString(arr));




    }
}
