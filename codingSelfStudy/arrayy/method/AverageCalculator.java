package codingSelfStudy.arrayy.method;
/*정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 */
public class AverageCalculator {

    public double solution(int[] arr) {
        int sum = 0;
        for(int n : arr) {
            sum += n;
        }
        return (double) sum / arr.length;

    }

    public static void main(String[] args) {
        AverageCalculator a = new AverageCalculator();
        System.out.println(a.solution(new int[1,3,4,5]);
    }
}

