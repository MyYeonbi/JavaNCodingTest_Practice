package codingStudy.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFundamental {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        //Integer
        List<Integer> numbers = new ArrayList<>();

        for(int i = 1; i< 10; i++){
            numbers.add(i);
        }
         //ArrayList, LinkedList
        //0. 배열을 리스트로 전환
        //1. 배열에 숫자를 추가하는 경우
        //2. 배열에서 숫자 삭제하는 경우
        numbers.remove(3);
        numbers.remove(Integer.valueOf(10));
        System.out.println(numbers);
        //3. 배열에서 중간값(5) 삭제하는 경우
        numbers.remove(Integer.valueOf(5));
        System.out.println(numbers);
        //4. 특정 위치에 값 추가.
        numbers.add(4,5);
        System.out.println(numbers);

        //5. 특정 값의 위치 찾기
        int findIdx = numbers.indexOf(5);
        System.out.println(findIdx);
        numbers.set(findIdx, 555);
        System.out.println(numbers);

        // 6 리스트 크기 확인
        System.out.println("리스트의 크기는 ? :" + numbers.size());
        // 리스트가 비어있는지 확인
        System.out.println("리스트가 비었은지? : " + numbers.isEmpty());
        //8. 특정 값이 포함되어 있는지 확인
        System.out.println("특정 값이 리스트에 포함되어있는지? : "+numbers.contains(9) );
    }
}
