package javaInt1Lecture.nested.nested.local;

public class LocalOuterV3 {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1; // 지역 변수는  스택 프레임이 종료되는 순간 함께 제거된다.

        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value: " + value);
                //인스턴스는 지역변수보다 더 오래 살아남는다.
                System.out.println("localVar: " + localVar);
                System.out.println("paramVar: " + paramVar);
                System.out.println("outInstanceVar: " + outInstanceVar);

            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();

    }
    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        localOuter.process(1);
    }
}
