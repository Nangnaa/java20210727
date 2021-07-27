package variable;

public class jungsuEx {
    byte b1;
    short s1;
    int i1;
    long l1;

    public jungsuEx() {
    }      //리턴 타입이 없는 메서드 - 생성자

    public static void main(String[] args) {
               //리턴  메서드
        JungsuEx j = new JungsuEx();
        //new 생성연산자(참조형변수에만)   jungsuex()생성자
        byte b2=(byte)130; //형변환 130이라는 인트를 바이트로 
    System.out.println(j.b1);
    System.out.println(j.s1);
    System.out.println(j.i1);
    System.out.println(j.l1);
    System.out.println(b2);
    System.out.println(j.b1 + b2);
    System.out.println(j.s1 + b2);
     j.i1 = 130 +j.s1;
     j.s1 = (short)j.i1; //큰데서 작은데로 (명시적 형변환)
     j.i1 = (int)j.s1;   // 작은데서 큰데로 (묵시적인 형변환 => 생략가능 int생략가능)
    System.out.println(j.i1);
    j.l1 = 10_000_000_000l;
system.out.println(j.l1);
}
}