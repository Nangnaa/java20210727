package array;

import java.util.Arrays;

public class Ex03 {
    public static void main(String[] args) {
      int[]arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));
        int total = 0;
        for(int i = 0; i<arr.length; i++){
            total += arr[i];
        }
        System.out.printf("총점: %3d ", total);

    }
}
