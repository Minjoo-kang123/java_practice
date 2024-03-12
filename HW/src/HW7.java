import java.util.Arrays;
import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] n = new int[num];
        n[0] = 1;
        for(int i = 1; i < num; i++){
            n[i] = n[i - 1] + i + 1;
        }
        System.out.println(Arrays.stream(n).sum());
    }
}
