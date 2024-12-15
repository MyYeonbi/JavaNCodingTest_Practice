package array;

public class InsertionSort2 {
    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3};

        System.out.println("정렬 전:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("정렬 후: ");
        printArray(arr);
    }
    public static void insertionSort(int[] arr) {
        //두번째 요소부터 시작
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i -1;

            // 정렬된 부분의 요소들과 키를 비교
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            //키를 적절한 위치에 삽입
            arr[j+1] = key;
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
