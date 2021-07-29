package array;

public class TwoDimenArrayEx {
    public static void main(String[] args) {
        //int[][] score = new int[4][3];
        int[][] score = {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}};
        printTwo(score);
        int[][] result = new int[score.length + 1][score[0]. length +1];

        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                result[i][j] = score[i][j];
                result[i][score[i].length] += score[i][j];

            }
        }
        printTwo(result);
    }

    private static void printTwo(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //score[i].length 그행의 길이만큼 돌아간다
                if (j != 0) System.out.print(",");
                System.out.printf("%4d", arr[i][j]);
            }
        }
    }
}
