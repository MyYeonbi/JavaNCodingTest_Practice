package codingStudy;

import java.util.*;
public class MoneyBundleCounter {
  public int solution(int money, int[] money_list) {
    Arrays.sort(money_list);
    int count = 0;

    for (int i = money_list.length -1; i >= 0; i--){
      int unit = money_list[i];
      int use = money / unit;
      money -= use * unit;
      count += use;
    }

    if (money != 0) {
      return -1;
    }
    return count;
  }

}
