package reviewCodingTest;

public class CutArr {
    public int[] solution(int[] numbers, int num1, int num2) {
        int [] answer = new int[num2-num1+1];
        for(int i = num1; i<= num2; i++){
            answer[i-num1] = numbers[i];
        }
        return answer;

    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int num1 = numbers[3];
        int num2 = numbers[6];
        System.out.println(solution(num1,num2));
    }
}

