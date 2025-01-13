package javaInt1Lecture.enumeration.ex3;

import javaInt1Lecture.enumeration.ex2.ClassGrade;

public class DiscountService {

   public int discount(ClassGrade classGrade, int price) {
       int discountPercent = 0;

       if (classGrade == ClassGrade.BASIC) {
           discountPercent = 10;
       } else if (classGrade == classGrade.GOLD) {
           discountPercent = 20;
       } else if (classGrade == classGrade.DIAMOND) {
           discountPercent = 30;
       } else {
           System.out.println("할인X");
       }
       return price * discountPercent / 100;

   }
}
