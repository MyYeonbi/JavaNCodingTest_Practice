package codingSelfStudy.math.twopointer;

public class NumberRepresentation {
    public int solution(int n) {
        int count = 0;

        for (int start = 1; start <= n; start++) {
            int sum = 0;

            for (int num = start; num <= n; num++){
                sum += num;

                if (sum ==n) {
                    count++;
                    break;
                }
                if (sum > n) {
                    break;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        NumberRepresentation nr = new NumberRepresentation();
        System.out.println(nr.solution(15));

    }

}
