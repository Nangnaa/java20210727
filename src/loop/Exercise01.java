package loop;

public class Exercise01 {
    public static void main(String[] args) {
        int x = 15;
        System.out.println(x>10 && x <20); //1
        char ch = 'A';
        System.out.println(ch !=' ' || ch !='\t'); //2
        System.out.println(!(ch ==' ' && ch =='\t')); //2
        System.out.println(ch >= '0' && ch <= '9'); //4
        System.out.println(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');//5
//        int year= 2021

    }
}
