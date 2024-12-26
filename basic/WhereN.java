package basic;

public class WhereN {
    public int solution(int[] array, int n){
        int count = 0;
        for (int num : array) {
            if (num == n) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        WhereN whereN = new WhereN();

        int[] array = {1,1,2,3,4,5,6,7,8,9};
        int n1= 1;
        System.out.println(whereN.solution(array, n1));
    }
}
