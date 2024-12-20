package javaBasicLecture.pack.com.helloshop.order;

import javaBasicLecture.pack.com.helloshop.product.Product;
import javaBasicLecture.pack.com.helloshop.user.User;

public class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
