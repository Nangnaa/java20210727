package Object2;

import java.util.concurrent.BrokenBarrierException;

public class InheritanceAndInterfaceEx2 {
    public static void main(String[] args) {
      Mammalia[] mammalias = new Mammalia[2];
      Bird birds = new Bird[2];
      mammalias[0] = new Tiger(); //명시적 형변환
      mammalias[1] = new Bat();//형변환 생략가능 묵시적 형변환
        birds[0] = new Eagle();
        birds[1] = new Ostrich();
    }
}

class Mammalia { }
class Bird{ }
class Tiger extends Mammalia{}
class Bat extends Mammalia{}

class Eagle extends Bird {}
class Ostrich extends Bird{}