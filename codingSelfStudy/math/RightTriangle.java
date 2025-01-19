package codingSelfStudy.math;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("삼각형의 높이를 입력하세요: ");
        int n = scanner.nextInt();

        printTriangle(n);

    }
    private static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
