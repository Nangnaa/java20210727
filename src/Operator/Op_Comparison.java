package Operator;

import java.util.Scanner;

public class Op_Comparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ID 입력:");
        String id = scan.nextLine();
        System.out.println("Pass 입력:");
        String pass = scan.nextLine();
        //id = root, pass=1234 라고 가정
        if(id.equalsIgnoreCase("root")){ //대소문자무시
            if (pass.equals("1234")){
                System.out.println("로그인 되었습니다.");
            } else {
                System.out.println("비밀번호가 다랍니다.");
            }
        } else {
            System.out.println("아이디가 다릅니다.");
        }
    }
} //왜 아이디가 다르다고 나오는지 : 문자열 JVM-constantPool이라는메모리 영역
//자바는 ==쓰면 인식을 못한다
