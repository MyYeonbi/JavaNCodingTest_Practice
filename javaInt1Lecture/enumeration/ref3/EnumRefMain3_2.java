package javaInt1Lecture.enumeration.ref3;




public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;

        int discount = Grade.BASIC.discount(price);
        int gold = Grade.GOLD.discount(price);
        int diamond = Grade.DIAMOND.discount(price);

        System.out.println("Basic: " + basic);
        System.out.println("Gold: " + gold);
        System.out.println("Diamond: " + diamond);
    }
}
