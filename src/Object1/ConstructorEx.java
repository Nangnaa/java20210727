package Object1;

public class ConstructorEx {
    public static void main(String[] args) {
        Bike autoBike = new Bike("black","auto");
        Bike threeBike = new Bike();
        autoBike.setColor("black");
        autoBike.setGearType("menual");
        //게터세터와 생성자 두개의 공통점 속성을 초기화하는것 같다.
        //차이는 시점의 차이
    }
}

class Bike {
    String color;
    String gearType;

    public Bike() {
        this("red","auto");
    }//this는 생성자를 가르킴 Bike(String color, String gearType)

    public Bike(String color, String gearType) {
        this.color = color;
        this.gearType = gearType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }
}