package javaBasicLecture.access.ex;

public class ShoppingCart {
    // 요구사항 : 1.접근제어자를 사용해서 데이터를 캡슐화 하라.
    // 2. 해당 클래스는 다른 패키지에서도 사용할 수 있어야 한다.
    // 3. 장바구니에는 상품을 최대 10개만 담을수 있다.(10개 초과 등록시 '장바구니가 가득 찼습니다.'출력)

  private Item[] items = new Item[10];
  private int itemCount;

  public void addItem(Item item) {
      if (itemCount >= items.length) {
          System.out.println("장바구니가 가득 찼습니다.");
          return;
      } else {
          items[itemCount] = item;
          itemCount++;
      }
  }


  /*
       장바구니 상품 출력
       상품명:마늘, 합계:4000
       상품명:상추, 합계:12000
       전체 가격 합: 16000
   */
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            System.out.println("상품명:" + item.getName() + " , 합계 : " + item.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
