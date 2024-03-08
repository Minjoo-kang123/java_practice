package array;

import java.util.Arrays;
import java.util.Random;

public class array7 {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] num = new int[5][5];
        boolean[] numbers = new boolean[101];
        int flag1 = 0;
        int flag2 = 0;
        int max_sum = 0;
        int min_sum = 0;

        while(flag1 < 5){
            int max = 0;
            int min = 101;
            flag2 = 0;
            while (flag2 < 5) {
                int n = r.nextInt(100) + 1;
                if (!numbers[n]) {
                    num[flag1][flag2] = n;
                    numbers[n] = true;
                    flag2++;
                    if(max < n){    max = n;    }
                    if(min > n){    min = n;    }
                }
            }
            max_sum += max;
            min_sum += min;
            flag1++;
        }

        for(int[] arr : num){
            System.out.println(Arrays.toString(Arrays.stream(arr).toArray()));
        }
        System.out.println("max sum : " + max_sum + "\nmin sum : " + min_sum);
    }
}
