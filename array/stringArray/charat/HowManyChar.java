package array.stringArray.charat;

public class HowManyChar {
    public static void main(String[] args) {
        String str = "apple";

        //'p'문자의 개수 찾기
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) == 'p') {
                count++;
            }
        }
        System.out.println("p가 몇 개냐면요..."+ count);
    }
}
