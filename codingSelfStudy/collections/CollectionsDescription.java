package codingSelfStudy.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Collections 클래스는 컬렉션(List,Set,Map)의 조작(정렬,섞기,복사,검색 등)을 도와주는 유틸리티 클래스.
* - java.util.Collections 패키지에 포함됨.
* - Collections 클래스는 인스턴스를 생성할 수 없는 static 메서드 모음*/
public class CollectionsDescription {
    public static void main(String[] args) {
        //1. Collections.sort(List<T>list) - 리스트 정렬
        // 리스트를 오름차순 정렬, 내부적으로 TimSort알고리즘 사용(시간복잡도 O(N log N)
        List<Integer> numbers = Arrays.asList(5,2,9,1,3);

        Collections.sort(numbers);// 오름차순 정렬
        System.out.println(numbers);// [1, 2, 3, 5, 9]

        //2. Collections.sort(List<T>list,Comparator<T>c) - 원하는 방식으로 정렬
        // 내림차순, 특정 기준 정렬 가능. Comparator를 사용하여 정렬 방식을 직접 지정
    }
}
