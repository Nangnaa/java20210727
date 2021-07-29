package loop;
import java.io.IOException;
import java.util.Scanner;

public class WhileEx {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            menu();
            int menuChoice = scan.nextInt();
            switch (menuChoice) {
                case 1:
                    memberRegist();
                    String member = scan.nextLine();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                default:
                    System.out.println("�޴��� Ȯ�ιٶ��ϴ�.");
                    continue;
            }
        }
    }
    private static void menu(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        System.out.println("ȸ������ ���α׷��Դϴ�. �޴��� �������ּ���");
        System.out.println("1. ȸ�� ���");
        System.out.println("2. ȸ�� ��ȸ");
        System.out.println("3. ȸ�� ����");
        System.out.println("4. ȸ�� Ż��");
        System.out.println("5. ����");
    }
    private static void memberRegist(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
        System.out.println("ȸ�� ���");
        System.out.println("1. �̸�");
        System.out.println("2. ��ȭ��ȣ");
        System.out.println("3. ���� �޴�");
         Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

    }
}
