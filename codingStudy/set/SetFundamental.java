package codingStudy.set;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SetFundamental {
    public static void main(String[] args) {
        //1. HashSet 생성
        Set<String> homework = new HashSet<>();

        //2. 요소 추가(add)
        homework.add("연비");
        homework.add("시완");
        homework.add("수민");
        homework.add("규찬");
        homework.add("규찬");

        //3. 크기 확인(size)
        System.out.println("Set 크기 :"+homework.size() );

        //4. 포함 여부 확인(contains)
        System.out.println("시완 포함 여부: " + homework.contains("시완"));
        System.out.println("태웅 포함 여부: " + homework.contains("태웅"));

        //5. 요소 제거 (remove)
        homework.remove("규찬");
        System.out.println("규찬 제거 후: "+ homework);

        //6. Set을 배열로 변환
        String[] homeworkArray = homework.toArray(new String[homework.size()]);
        System.out.println("배열로 변환 : " + Arrays.toString(homeworkArray));

        //7. 반복문으로 요소 순회
        System.out.println("요소 순회:");
        for (String person : homeworkArray) {
            System.out.println(person);
        }

        //8.Set 비우기(clear)
        homework.clear();
        System.out.println("Set 비었는지 확인 : "+homework.isEmpty() );




    }
}
