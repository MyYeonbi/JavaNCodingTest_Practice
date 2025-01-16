package javaInt1Lecture.nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested{
        private int nestedInstanceValue = 1;

        public void print() {
            // 자신의 멤버에 접근
            System.out.println(nestedInstanceValue);

            
        }
    }
}
