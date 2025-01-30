package codingSelfStudy.map;
import java.util.*;

/*Map은 Colloection 인터페이스를 직접 구현하지 않음!
* - key- value(키-값)형태로 데이터 저장
* - 키는 중복 불가능. 값은 중복 가능.
* - 요소의 순서 유지 X (LinkedHashMap은 순서 유지)*/
public class MapDescription {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("A",3); // 기존 A의 값이 3으로 변경됨.

        System.out.println(map);
        // {A=3, B=2} (순서는 랜덤)
    }


}
