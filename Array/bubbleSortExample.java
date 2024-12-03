package Array;

public class bubbleSortExample {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // 최적화: 교환 여부 확인
            for (int j = 0; j < n -i -1; j++) {
                if (arr[j] > arr[j +1]) {
                    //교환
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            //교환이 발생하지 않으면 이미 정렬된 상태
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34,25, 12,22, 11, 90};
        System.out.println("Original array: ");
        printArray(arr);
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
