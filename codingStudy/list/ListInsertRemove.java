package codingStudy.list;
import java.util.ArrayList;
import java.util.List;

public class ListInsertRemove {
    public static void main(String[] args) {
        int n = 10; //입력값

        // 리스트 생성 및 데이터 추가
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        //중간 위치에 1000삽입
        list.add(n/2, 1000);

        // 삽입한 데이터 삭제
        list.remove(n/2);

        System.out.println(list);
    }
}
