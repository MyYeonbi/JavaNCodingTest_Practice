package codingSelfStudy.arrayy.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    /* Arrays.stream(B)
     * 1. 무엇을 하나 - 배열 B를 스트림으로 변환. Stream은 "연속된 데이터 흐름을 다룰 수 있는 기능"을 제공.
     * 2. 유의점 : int[]을 Stream<int[]>가 아니라 IntStream으로 변환함. 즉, 기본형 int에 특화된 IntStream 제공.
     * */
    public static void main(String[] args) {

        // 일반적인 for문 형식 - 하나씩 반복하면서 처리해야 하고, result 리스트를 따로 관리해야 함.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result = new ArrayList<>();

        for (int num : list) {
            result.add(num * 2); // 각 요소를 2배로 변환
        }
        System.out.println(result);

        // 하지만 Stream을 사용하면?
        List <Integer> list2 = Arrays.asList(1,2,3,4,4,4);
        List <Integer> result2 = list2.stream()
                .map(num -> num * 2)//요소를 2배로 변환
                .collect(Collectors.toList());// 리스트로 변환
        /*map()은 각 요소를 변환하는 과정이고, collect()는 최종 결과를 리스트로 수집하는 것. */
        System.out.println(result2);


        // (1) 어떤 경우에 Stream을 사용할까? 1-1) 배열이나 컬렉션을 다룰 때(배열,List,Set,Map)같은 데이터 집합을 한번에 가공!
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,5,5);
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0) //filter() : 조건에 맞는 요소만 남김
                                            .collect(Collectors.toList()); // .collect() : 리스트로 변환

        // (2) 정렬을 간편하게 할 때 - 배열이나 리스트를 정렬할 때도 Stream이 유용하다.
              // 숫자 정렬하기
        int[] arr = {5,3,9,1,3};
        int[] sortedArr = Arrays.stream(arr)
                                .sorted() // 정렬
                                .toArray(); // 배열로 변환

        System.out.println(Arrays.toString(sortedArr));


        // (3) 데이터 변환(Mapping) - 각 요소를 변환할 때도 Stream이 강력.
             // 모든 숫자를 문자열로 변환하기.
        List <Integer> num = Arrays.asList(1,2,3);
        List <String> stringNumbers = num.stream()
                                          .map(n -> "Number: " +n)
                                          // 문자열 변환
                                          .collect(Collectors.toList());

        System.out.println(stringNumbers);

        // (4) 데이터 집계(sum,count,average 등)
           // 평균값 구하기.
        List<Integer> num2 = Arrays.asList(10,20,30,40);

        double avg = num2.stream().mapToInt(n -> n) // Stream<Integer>를 IntStream으로 변환
                /*.mapToInt(n->n)을 왜 쓰는 걸까?!!
                * stream<Integer>를 IntStream으로 변환하는 역할을 한다.
                * - Stream<T> : 객체형 스트림(ex: Stream<Integer>, Stream<String>)
                * - IntStream : 기본형 int 스트림(메모리 절약, 성능 최적화)
                * - 문제점 : Stream<Integer>는 기본형이 아닌 Integer 객체를 다루기 때문에 숫자를 처리할 때 박싱/언박싱 오버헤드 발생!
                *           sum(), average(), max() 같은 숫자 관련 메서드를 사용하려면 IntStream이 필요하다...*/
                                  .average()
                                  //평균 계산
                                  .orElse(0);
                                  // 값이 없을 경우 0을 반환.
        System.out.println(avg); //25.0


        // (5) 최대/최소값 찾기
           // 최대값 찾기.
        List <Integer> num5 = Arrays.asList(3,6,2,8,5);

        int max = num5.stream().mapToInt(n->n).max().orElse(-1);
        System.out.println(max); //8


        // (6) 중복 제거 - 중복된 값 제거하기
        List<Integer> num3 = Arrays.asList(1,2,2,3,4,4,5);

        List<Integer> distictNumbers = num3.stream()
                                           .distinct() //중복 제거
                                           .collect(Collectors.toList());
        System.out.println(distictNumbers);


    }
}