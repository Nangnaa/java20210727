package Operator;

import java.util.Scanner;

public class Op_Math {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("전체 갯수를 입력하시오");
        int ea = scan.nextInt();
        System.out.println("담을 바구니의 크기를 입력하시오");
        int basket = scan.nextInt();
        int basket_num = ea/basket+(ea%basket>0?1:0);
//        int basket_num = (int)Math.ceil(ea/(float)basket); //ea/basket 인트나누기 인트라 실해안됨
        System.out.printf("전체 갯수: %d/ 바구니수: %d",ea , basket_num);
    }
}
