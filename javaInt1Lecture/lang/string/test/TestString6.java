package javaInt1Lecture.lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";// 검색 대상 문자열
        String key = "hello"; // 찾을 키워드

        int count = 0;  // 키워드 등장 횟수를 저장할 변수
        int index = str.indexOf(key); // 처음으로 키워드가 나타나는 위치
        System.out.println("index: " + index); // 첫 번째 등장 위치 출력


        while (index >= 0) {  // 키워드가 더 이상 나타나지 않을 때까지 반복
           index =  str.indexOf(key, index + 1);  // 현재 위치 이후에서 키워드 탐색
            count++; // 키워드 등장 횟수 증가
        }
        System.out.println("count: " + count);
    }
}
