package valueOf;

public class StringValue {
    char c = 'a';
    String str = String.valueOf(c);

    public static void main(String[] args) {
        StringValue sv = new StringValue();
        System.out.println(sv.str.toString());
    }
}
