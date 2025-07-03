package codingStudy;

import java.util.Arrays;

public class fk {
  public static void main(String[] args) {
    //배열의 한계
    int[] numbers = {1,2,3,4,5,6,7,8,9};
    System.out.println(Arrays.toString(numbers));

    //1. 배열에 숫자 추가하는 경우
    int[] numbers2 = new int[numbers.length+1]; //11칸 짜리 만들기
    for (int i = 0; i < numbers.length; i++) {
      numbers2[i] = numbers[i];
    }
    numbers2[numbers.length]=11;
    //2. 배열에서 숫자 삭제하는 경우, 11을 삭제해서 기본 배열 요소 만들기
    int[] numbers3 = new int[numbers2.length-1];
    for (int i = 0; i < numbers2.length-1; i++) {
      numbers3[i] = numbers2[i];
    }
    System.out.println(Arrays.toString(numbers3));
    //3. 배열에서 중간값(5) 삭제하는 경우
    int[] numbers4 = new int[numbers.length-1];

    for(int i = 0; i < 4; i++){
      numbers4[i] = numbers[i];
    }
    for(int i = 5; i < numbers4.length; i++){
      numbers4[i-1] = numbers[i];
    }
    numbers = numbers4;
    System.out.println(Arrays.toString(numbers));
  }

}
