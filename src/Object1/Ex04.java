package Object1;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println(Mypoint.getDistance(1,1,2,2));
        Mypoint p = new Mypoint(1,1);
        System.out.println(p.getDistance(2,2));

    }
}

class Mypoint{
    int x, y;

    public Mypoint(int x, int y) {
        this.x = x;
        this.y = y;
    } //6-4번

    static double getDistance(int x, int y, int x1, int y1){
        double result = 0.0;
        result = Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
        return result;
    } //6-5번
     double getDistance(int x, int y){
        return Math.sqrt(Math.pow((this.x-x),2) + Math.pow((this.y-y),2));
    } //6-6번

}