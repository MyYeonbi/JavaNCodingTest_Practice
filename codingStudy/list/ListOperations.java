package codingStudy.list;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListOperations {
    public static void main(String[] args) {
        //초기화
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        //배열 데이터 추가
        int[] data = {10, 20, 30, 40, 50};
        for (int num : data) {
            arrayList.add(num);
            linkedList.add(num);
        }

        //삽입 및 삭제
        arrayList.add(2,25);
        linkedList.add(2, 25);

        arrayList.remove(0);
        linkedList.remove(0);

        System.out.println("최종 ArrayList: "+ arrayList);
        System.out.println("최종 LinkedList: "+ linkedList);
    }
}
