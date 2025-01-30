package codingSelfStudy.arrayy.method;
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

        //list.add(6); //UnsupportedOperationException 발생!Arrays.asList()로 만든 리스트는 크기 변경이 불가능
    }

}
