package javaBasicLecture.final1;

public class FinalLocalMain {

    public static void main(String[] args) {
       //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FinalInit finalInit1 = new FinalInit();
        FinalInit finalInit2 = new FinalInit();
        FinalInit finalInit3 = new FinalInit();

        System.out.println(finalInit1.value);
        System.out.println(finalInit2.value);
        System.out.println(finalInit3.value);

        //상수
        System.out.println("상수");
        System.out.println(FinalInit.CONST_VALUE);

       

        System.out.println(Construct.PI);
    }


}
