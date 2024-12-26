package basic;

public class RemoveString {
    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");

    }
    public static void main(String[] args) {
        RemoveString removeString = new RemoveString();

        String my_string = "Hello World";
        String letter = "World";

        String result = removeString.solution(my_string, letter);
        System.out.println(result);
    }
}
