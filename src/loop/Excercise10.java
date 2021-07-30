package loop;

import java.util.Scanner;

public class Excercise10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rand = (int) (Math.random() * 100) + 1;
        System.out.println("숫자를 맞춰보세요");
        while (true) {
            int answer;
            try {
                answer = Integer.parseInt(scan.nextLine());
            } catch (Exception e) {
                System.out.println("숫자를 입력해주세요");
                break;
            }
            if (answer > rand) {
                System.out.println("큽니다");
            } else if (answer < rand) {
                System.out.println("작습니다");
            } else {
                System.out.println("정답입니다");
                break;

            }
        }
    }
}