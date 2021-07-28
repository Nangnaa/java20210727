package Operator;
//95p 문제 3-1
public class Exercise03 {
    public static void main(String[] args) {
        byte b =10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;
        b=(byte)i; //큰에서 작은 생략불가
        ch = (char)b; //-128~127 => 0~65535 음수때문에 형변환이 있어야한다
        short s = (short)ch; //0~65535 => -32768~32767
        float f = (float)l; //생략가능 long qhek float가 표현범위가큼
        i = (int)ch; //생략가능

    }
}
