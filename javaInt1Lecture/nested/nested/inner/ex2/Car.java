package javaInt1Lecture.nested.nested.inner.ex2;



public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    //Engine에서만 사용하는 메서드
       public String getModel() {
        return model;
    }

    //Engine에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

   public void start(){
        engine.start();
       System.out.println(model + "시작 완료");
   }
    public class Engine {

        private Car car;

        public Engine(Car car) {
            this.car = car;
        }

        public void start() {
            System.out.println("충전 레벨 확인: car.getChargeLevel()" + car.getChargeLevel());
            System.out.println(car.getModel() + "의 엔진을 구동합니다.");
        }
    }
}
