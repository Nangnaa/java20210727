package Object2;

public class InheritanceAndInterfaceEx {
    public static void main(String[] args) {

    }
}

class SiegeTank extends  Terran {

}
class BattleCruiser extends  Terran implements Flyable, Groundable { //인터페이스를 사용하여 다중상속가능
    @Override
    public void fly() {

    }
}

interface Flyable { //다중상속의 보완을 위한 인터페이스
    static int ENGINE = 4; //ENGINE 상수는 대문자 public static final int ENGINE = 4;
    void fly(); //추상메서드 (완성되어있지않은 메서드)  public abstract void fly();
}

interface Groundable{

}
