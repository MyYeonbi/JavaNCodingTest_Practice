package basic;

public class MaxMin2 {

    public String solution(String s) {
        String answer = "";
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        int num;

        String[] strArr = s.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            num = Integer.parseInt(strArr[i]);

            if (num < min) min = num;
            if (num > max) max = num;
        }
        answer = min + " " + max;

        return answer;
    }


    public static void main(String[] args) {
        MaxMin2 maxMin2 = new MaxMin2();
        System.out.println((maxMin2.solution("5 6 7 8 9")));
    }
}
