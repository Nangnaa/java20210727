package loop;

public class ForEx {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i <= 10; i++) { //int가 반드시 들어가야한다
            total += i;
        }//total값을 초기화한다 이유는 초기화를 하지않으면 지역변수는 없는 값이 되어버린다.
        System.out.println(total);
        for (int i = 10; i > 0; i--) {
            for (long j = 0; j < 5000000000L; j++) {
            }
            System.out.println(i);
        }
    }
}
