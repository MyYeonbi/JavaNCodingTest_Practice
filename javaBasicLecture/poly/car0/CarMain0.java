package javaBasicLecture.poly.car0;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        driver.setK3Car(k3Car);
        driver.drive();

        //추가
        Model3Car model3Car = new Model3Car();
        driver.setK3Car(null);
        driver.setModel3Car(model3Car);
        driver.drive();

        /*이러한 문제점을 다형성을 활용하면 해결 가능하다.
        역할과 구현을 분리해서, 클라이언트 코드의 변경 없이 구현 캑체를 변경할 수 있다.
        다음 단계에서 Driver가 클라이언트다.
         */

    }
}
