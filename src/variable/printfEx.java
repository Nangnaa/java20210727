package variable;
//public 은 한파일에 하나이고 이름도 파일이름과 같아야한다.
public class printfEx {
    public static void main(String[] args) {
        int i = 100;
        float f = 3.141592f;
        char c = 'A';
        String str = "Hello World~!";
        //%d, decimal
        System.out.printf("총점은 %d입니다. \n", i);
        //0하나더 %f, float
         System.out.printf("PI의 값은  %10.7f입니다. %n", f);
         //한줄내려쓰기 %n %c. char
        System.out.printf("영어 대문자의 시작은 %c입니다.", c);
        //%s, String
        System.out.printf("\"안녕 세상아~!\" = \"%s\"  %n", str);
        System.out.printf("\"안녕 세상아~!\" = \"%15s\"  %n", str); //앞에 띠어쓰기
        System.out.printf("\"안녕 세상아~!\" = \"%-15s\"  %n", str); //뒤로 띄어쓰기

    }
}
