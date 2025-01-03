package codingStudy.list;
import java.util.ArrayList;
import java.util.List;

public class ListAccess {
    public static void main(String[] args) {
        int n = 10; //입력 값

        //리스트 생성 및 데이터 추가
        List<Integer>list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i); //.add()에서 ()안의 내용은 데이터의 내용이다.
        }

        // 특정 위치 데이터 반환
        int first = list.get(0);
        /* 첫번째 데이터 .get()에서 괄호 안은 인덱스의 번호이다.
        인덱스를 번호를 가지고 위치에 있는 데이터를 가져오는것.
         */
        int middle = list.get(n/2); //중간 데이터
        int last = list.get(list.size()-1);// 마지막 데이터

        System.out.println("[" + first + ", " + middle + ", " + last + "]");
    }

}
