package codingSelfStudy.arrayy.method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*List<T> list = Arrays.asList(T... elements);
* ✔ 가변 인자를 받아 리스트로 변환
✔ T... elements는 여러 개의 값을 받을 수 있는 가변 인자 문법
✔ List<T> 타입의 고정 크기 리스트가 생성됨
*
* ✅ 리스트가 생성되지만 크기를 변경할 수 없음! */
public class AsList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list);

        //(1) list.add(6); //UnsupportedOperationException 발생!Arrays.asList()로 만든 리스트는 크기 변경이 불가능

        // 고정크기 기반의 배열을 리스트로 바꿨을때 크기가 변경이 안되지만 new ArrayList<>(list)로 변경하면 크기 변경 가능!
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3,3,3,3));
        list2.add(6);
        System.out.println(list2);


        //(2) int[] 배열을 Arrays.asList()에 넣으면 문제가 생긴다. 배열 전체가 하나의 요소로 취급된다.
        int[] arr = {1,1,1,1};
        List<int[]> list3 = Arrays.asList(arr);
        System.out.println(list3); // [[I@1b6d3586] (int 배열 1개가 리스트 요소로 들어감)

        // (2-1) 해결 방법 : 기본형 int[]이 아닌 Integer[] 사용!
        Integer[] arr2 = {1,2,3,4,5,5,};
        List<Integer> list4 = Arrays.asList(arr2); // 올바르게 변환됨.

        /
     }

}
