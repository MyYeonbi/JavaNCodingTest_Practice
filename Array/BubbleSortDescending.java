package Array;

public class BubbleSortDescending {
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n-1; i++) {
            swapped = false; //교환 여부 확인
            for (int j = 0; j < n -i -1; j++) {
                if (arr[j] < arr[j + 1]) {  // 내림차순: arr[j] < arr[j + 1]
                    // 교환
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                }
            }
            //교환이 발생하지 않으면 정렬 완료
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7, 4, 1};
        System.out.println("Original array:");
        printArray(arr);

        bubbleSortDescending(arr);

        System.out.println("Sorted array in descending order:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

}
