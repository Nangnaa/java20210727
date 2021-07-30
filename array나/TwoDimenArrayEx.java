package array;

public class TwoDimenArrayEx {
    public static void main(String[] args) {
//        int[][] score = new int[4][3];
        int[][] score = {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}};
        printTwo(score);

        int total = 0;
        int[][] result = new int[score.length + 1][score[0].length+1];
        for (int i = 0; i <score.length ; i++) {
            for (int j = 0; j < score[i].length; j++) {  //score[i].length 그행의 길이만큼 돌아간다
                result[i][j] = score[i][j]; //행우선순위 2차원 배열
                result[i][score[i].length] += score[i][j]; //열고정 가로로 값을 더해서 4번째 자리에 출력
                result[score.length][j] += score[i][j]; //행고정 세로로 더해서 값을 출력 index 4 0~3자리를 더해서 4의 인데스에출력
                result[score.length][score[i].length] += score[i][j];
            }
        }
        printTwo(result);

    }
    private static void printTwo(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j!=0) System.out.print(",");
                System.out.printf("%4d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
