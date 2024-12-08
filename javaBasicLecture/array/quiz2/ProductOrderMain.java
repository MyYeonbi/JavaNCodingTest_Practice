package javaBasicLecture.array.quiz2;

public class ProductOrderMain {

    public static void main(String[] args) {
        ProductOrder productorder1 = new ProductOrder();
        productorder1.productName = "과자";
        productorder1.productPrice = 120;
        productorder1.productQuantity = 10;

        ProductOrder productorder2 = new ProductOrder();
        productorder2.productName = "쵸콜릿";
        productorder2.productPrice = 150;
        productorder2.productQuantity = 10;

        ProductOrder [] productOrders = {productorder1, productorder2};

        for (ProductOrder p : productOrders) {
            System.out.println(" 품목 명 : " + p.productName + " 가격: " + p.productPrice + " 수량 : " + p.productQuantity );
        }
        System.out.println("총 금액 : " + (productorder1.productPrice * productorder1.productQuantity + productorder2.productPrice * productorder2.productQuantity));

    }
}
