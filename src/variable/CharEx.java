package variable;

public class CharEx {
    //    char c4 = ' ';
    static char c4 = '\u0000';
    public static void main(String[] args) {
        //char의 기본값은 공백
        char c1 = 'A'; //65
        char c2 = '0'; //48
        char c3 = 'a'; //97
        CharEx ce = new CharEx();
        //메서드안에서는 지역변수
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.println(new CharEx().c4);
        System.out.println("Take on me");
        System.out.println();
        System.out.println(Integer.parseInt("123"));
        System.out.println(c1 + 1);
        System.out.println(++c1); //증가하면 b가나온다
    }
}
