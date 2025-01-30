package codingSelfStudy.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListDescription {
    /* List는 Collection을 구현하는 인터페이스
    * - 요소를 순서대로 저장
    * - 중복된 값 허용
    * - 인덱스로 요소에 접근 가능. */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("A"); //중복 허용

        System.out.println(list);
    }
}
