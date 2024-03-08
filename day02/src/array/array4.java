package array;

import java.util.Arrays;
import java.util.Random;

public class array4 {
    public static void main(String[] args) {
//        Random r = new Random();
//        int num = r.nextInt(10) + 1;
        Random r = new Random();
        int[] num = new int[10];
        int flag = 0;
        while(flag < 10){
            int n = r.nextInt(100) + 1;
            if(!Arrays.asList(num).contains(r))
                num[flag] = n;
            flag++;
        }
        int sum = Arrays.stream(num).sum();
        double avg = sum * 1.0 / num.length;
        System.out.println(Arrays.toString(num) + " sum : " + sum + " avg : " + avg);
    }
}
