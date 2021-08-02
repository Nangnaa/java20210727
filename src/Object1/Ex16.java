package Object1;

public class Ex16 {
    public static void change(String str) {
        str +="456";
        System.out.println(str.hashCode());
        System.out.println("change()의 str :"+str);
    }

    public static void main(String[] args) {
        String str ="ABC123";
        System.out.println(str);
        //String type의 변수는 매개변수로 넘어갈때
        //주소값이 아닌 char[]의 실제 값이 넘어갑니다.
        //String 타입의 변수는 연산이 되지않는다.
        //String이 연산을 하게되면 새로운 주소로 변경된다.
        change(str);

        System.out.println("After change :" +str);
        System.out.println(str.hashCode());
    }


}
