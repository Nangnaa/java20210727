package Operator;

public class MyMath {
    public static void digitRound(double d, int digit){
        double tmp = d * Math.pow(10, digit); //float와 double 표현범위차이
        tmp = Math.round(tmp) / Math.pow(10, digit);
        System.out.println(String.format ("%f",tmp));
        System.out.printf("최종 출력값 : %f %n", tmp);
        System.out.println("최종 출력값: " +tmp);
    }
} //클래스안에 코드가 들어간다