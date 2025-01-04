package javaBasicLecture.poly.car1;



public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(k3)
        K3Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        // 차량 변경(k3 -> model3)
        Model3Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();

        // 차량 변경(model3 -> NewCar)
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();

        /* < OCP 원칙 설명 >
        1. 확장에 열려있다는 의미 : Car 인터페이스를 사용해서 새로운 차량을 자유롭게 추가할 수 있다. Car 인터페이스를 구현해서 기능을 추가할 수 있다는 의미.
        그리고 Car 인터페이스를 사용하는 클라이언트 코드인 Driver도 Car인터페이스를 통해 새롭게 추가된 차량을 자유롭게 호출할 수 있다. 이것이 확장에 열려있다는 의미이다.

        2. 코드 수정은 닫혀 있다는 의미: 새로운 차를 추가하게 되면 기능이 추가되기 때문에 기존 코드의 수정은 불가피하다. 당연히 어딘가의 코드는 수정해야 한다.- 수정해야 할 부분은 차량 교체를 위한 코드이다. 이런 부분은 ocp를 지켜도 변경이 필요하다. 

        3. 변하지 않는 부분 : 새로운 자동차를 추가할 때 가장 영향을 받는 클라이언트는 바로 Car의 기능을 사용하는 Driver이다. 핵심은 Car 인터페이스를 사용하는 클라이언트 Driver의 코드를 수정하지 않아도 된다는 뜻이다.
         */


    }
}
