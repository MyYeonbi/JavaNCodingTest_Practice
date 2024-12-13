package array;

public class InsertionSort {public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int key = arr[i]; // 현재 정렬 대상
        int j = i - 1;

        // 현재 키보다 큰 값을 뒤로 이동
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        // 키를 올바른 위치에 삽입
        arr[j + 1] = key;
    }
}

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("정렬 전: ");
        for (int num : arr) System.out.print(num + " ");

        insertionSort(arr);

        System.out.println("\n정렬 후: ");
        for (int num : arr) System.out.print(num + " ");
    }
}
