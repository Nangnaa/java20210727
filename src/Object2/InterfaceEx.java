package Object2;

public class InterfaceEx {
    public static void main(String[] args) {
    Fightable fightable = new FireBat();
    FireBat fireBat = (FireBat)fightable;
    fireBat.attack();
    FireBat fb = new FireBat();
    fightable = fb;
    Fightable fightable2 = new Dragoon();

    }
}
interface Fightable {
    void attack();
}

class FireBat extends Terran implements Fightable{
    @Override
    public void attack() {
        System.out.println(hp);

    }
}
class Dragoon extends Protoss implements Fightable{
    @Override
    public void attack() {

    }
}