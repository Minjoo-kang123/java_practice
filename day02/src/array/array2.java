package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(a));
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < a.length; i++){
            sum1 += a[i];
        }
        System.out.println(sum1);
        for (int j : a) {
            sum2 += j;
        }
        System.out.println(sum2);
    }
}
