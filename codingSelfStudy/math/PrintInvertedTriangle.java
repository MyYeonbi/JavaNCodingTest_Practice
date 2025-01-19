package codingSelfStudy.math;

import java.util.Scanner;

public class PrintInvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("삼각형의 높이를 입력하세요: ");
        int n = scanner.nextInt();

        printTriangle(n);

    }
    private static void printTriangle(int n) {
        for (int i = n; i >=1 ; i--) {
            //i는 현재 줄의 별 개수
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();// 줄 바꿈
        }
    }
}
