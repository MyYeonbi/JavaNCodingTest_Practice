package Array;
import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        //배열의 크기만큼 반복
        for (int i = 0; i < n-1; i++) {
            //현재 범위에서 최소값의 인덱스를 찾기
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //최소값과 현재 위치의 값을 교환
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        //입력배열
        int[] arr = {64, 34, 25,12,22,11,90};
        System.out.println("정렬 전: "+ Arrays.toString(arr));

        //선택 정렬 수행
        selectionSort(arr);

        //정렬 결과 출력
        System.out.println("정렬 후: " + Arrays.toString(arr));
    }
}
