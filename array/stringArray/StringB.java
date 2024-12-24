package array.stringArray;

public class StringB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(5, "is");
        sb.reverse();
        System.out.println(sb.toString());


        sb.reverse();
        sb.delete(5,7);
        String string = sb.toString();
        System.out.println(string);


    }
}
