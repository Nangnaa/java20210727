package Object2;

public class StarCraftEx {
    public static void main(String[] args) {

    }
}

class Unit {
    int x,y;
    int hp;
    void move(){}//메서드
    void stop(){}
}

class Terran extends Unit {
    String tribe = "Terran";
}

class Marine extends Terran {
    static int attLv;
    static int defLv;
    void attack(){

    }
}

class Protoss extends Unit{
    String tribe = "Protoss";
}
class Zealot extends Protoss {
    static int attLv;
    static int defLv;
    void attack(){

    }
}