package recursion;

public class FactorialMultiple {
    public static void main(String[] args) {
        int num = 6;
        int result = 1;

        for (int i = 1; i <= num; i++){
            result = result * i;
        }

        System.out.println(num + "의 팩토리얼 값은 : "+ result);
    }
}
