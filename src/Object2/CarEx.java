package Object2;

public class CarEx {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        FireCar fireCar = new FireCar();
        fireCar.drive();
        fireCar.stop();
        SportsCar sportsCar = new SportsCar();
        System.out.println(fireCar instanceof Car? "상속관계":"관계없음");
        System.out.println(sportsCar instanceof Car? "상속관계":"관계없음");
        System.out.println(new Car() instanceof Car? "상속관계":"관계없음");
        System.out.println(fireCar instanceof Object? "상속관계":"관계없음");
        System.out.println(sportsCar instanceof Object? "상속관계":"관계없음");
        System.out.println(car instanceof Object? "상속관계":"관계없음"); //모든클래스의 조상은 오브젝트에 상속을받게되어있다.
        car = fireCar;
//        fireCar = (fireCar)sportsCar; 수직관계 형성이안됨
        fireCar = (FireCar) car; //자식 > 부모 > 자식 가능
    }
}

class Engine{}
class Car{
    int wheel;
    void drive(){}
    void stop(){}
    Engine engine;
    @Override
    public String toString() {
        return getClass().getName();
    //오버라이딩 조상을 재정의
    }
}
class FireCar extends Car {
    void waterGun(){}
}
class SportsCar extends Car {
    int turbo;

}