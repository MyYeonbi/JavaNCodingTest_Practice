package Array;

import java.util.Arrays;
public class SelctionSortDescending {
    public static void selctionSortDescending(int[] arr){
        int n = arr.length;

        // 배열의 크기만큼 반복
        for (int i = 0; i < n-1; i++) {
            //현재 범위에서 최대값의 인덱스를 찾기
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    //내림차순 : 큰 값 우선
                    maxIndex = j;
                }
            }
            //최대값과 현재 위치의 값을 교환
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        //입력 배열
        int[] arr = {45, 23,89, 12,37};
        System.out.println("정렬 전: " + Arrays.toString(arr));

        //선택 정렬(내림차순) 수행
        selctionSortDescending(arr);

        //정렬 결과 출력
        System.out.println("내림차순 정렬: " + Arrays.toString(arr));

        //첫 번째와 마지막 원소의 곱 계산
        int result = arr[0] * arr[arr.length -1];
        System.out.println("첫 번째 원소와 마지막 원소의 곱: "+ result);
    }
}
