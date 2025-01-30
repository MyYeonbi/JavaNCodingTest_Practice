package codingSelfStudy.collections.set;
import java.util.*;
public class SetDescription {
    /* Set도 Collection을 구현하는 인터페이스.
    * 1) 중복 요소 허용 X
    * 2) 요소의 저장 순서를 유지하지 않음
    * 3) 정렬이 필요한 경우 TreeSet 사용*/
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A"); // 중복 값 무시됨.

        System.out.println(set);  // [A, B] (순서는 랜덤)

    }
}
