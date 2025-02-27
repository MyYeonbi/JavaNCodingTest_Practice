package codingSelfStudy.arrayy.method.asList;

/*	•	Arrays.asList()는 배열(Array)을 리스트(List)로 바꿔주는 메서드야!
	•	자바에서 배열은 크기를 바꿀 수 없지만, 리스트는 크기를 조절할 수 있어.
	•	그래서 배열을 리스트처럼 다루고 싶을 때 Arrays.asList()를 사용해!*/

import java.util.Arrays;
import java.util.List;
public class AsList {
    public static void main(String[] args) {
        // 배열 생성
        String[] words = {"apple", "banana", "cherry"};

        // 배열을 리스트로 변환
        List<String> wordList = Arrays.asList(words);

        // 출력
        System.out.println(wordList); // [apple, banana, cherry]

        /*✅ 1. Arrays.asList()가 왜 필요할까?

✔️ 배열은 크기를 조절할 수 없지만, 리스트는 가능해!
✔️ 배열보다 리스트가 유용한 경우가 많아.
✔️ 반복문, 탐색, 조작을 더 쉽게 할 수 있어!
*/
        System.out.println(Arrays.asList(words).contains("banana"));


/*✅ 4. Arrays.asList()로 만든 리스트의 특징

🚨 주의할 점! 🚨
Arrays.asList()로 만든 리스트는 배열에 연결된 형태라 크기를 바꿀 수 없어!*/

        

    }


}
