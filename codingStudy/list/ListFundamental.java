package codingStudy.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFundamental {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        //Integer
        List<Integer> numbers = new ArrayList<>();
         //ArrayList, LinkedList
        //0. 배열을 리스트로 전환
        //1. 배열에 숫자를 추가하는 경우
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
        int[] nums = {1,2,3};
        System.out.println(Arrays.toString(nums));
        //2. 배열에서 숫자 삭제하는 경우
        //3.
    }
}
