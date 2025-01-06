package codingSelfStudy.scanner;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a의 값을 입력하세요.");
        int a = sc.nextInt();
        System.out.println("b의 값을 입력하세요.");
        int b = sc.nextInt();

        System.out.println("a =" + a);
        System.out.println("b =" + b);
    }
}
