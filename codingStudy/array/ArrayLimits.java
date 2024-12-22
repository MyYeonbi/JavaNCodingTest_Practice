package codingStudy.array;

import java.util.Arrays;

public class ArrayLimits {
    public static void main(String[] args) {
        //배열의 한계
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numbers));

        //1. 배열에 숫자 추가하는 경우
        int numbers2 = new int[numbers.length+1]; //11칸 짜리 만들기
        for (int i = 0; i < numbers.length; i++) {
            numbers2[i] = numbers[i];
        }
        numbers2[numbers.length]=11;
        //2. 배열에서 숫자 삭제하는 경우

        //3. 배열에서 중간값(5) 삭제하는 경우
    }
}
