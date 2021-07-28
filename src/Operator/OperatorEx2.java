package Operator;
//overflow
public class OperatorEx2 {
    public static void main(String[] args) {
        int a = 1000000;
        int b = 2000000;
        long l = 2000000L;

        long c = a * (long)b; //둘중에 하나는 long으로 형변환을 시켜주어야한다.
        long d = a * l;
        System.out.println(c);
        System.out.println(d);
    }
}
