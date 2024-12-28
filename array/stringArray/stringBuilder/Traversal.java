package array.stringArray.stringBuilder;

public class Traversal {
    public static void main(String[] args) {


    StringBuilder sb = new StringBuilder("hello");

    for (int i = 0; i <sb.length();i++){
        char c = sb.charAt(i);
        System.out.print(c);
    }

    }
}
