package javaBasicLecture.access.ex;

public class ShoppingCart {
    // 요구사항 : 1.접근제어자를 사용해서 데이터를 캡슐화 하라.
    // 2. 해당 클래스는 다른 패키지에서도 사용할 수 있어야 한다.
    // 3. 장바구니에는 상품을 최대 10개만 담을수 있다.(10개 초과 등록시 '장바구니가 가득 찼습니다.'출력)
   private String name;
   private int price;
   private int quantity;
   private int maxQuantity = 10;

    public ShoppingCart(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void addItem(name, price,quantity) {
        if (quantity > maxQuantity) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
    }
    public void displayItem (name, price, quantity){
        System.out.println(this.name + " " + this.price + " " + this.quantity);
    }
}
