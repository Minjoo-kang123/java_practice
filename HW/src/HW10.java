import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int left = 0;
        int right = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '(')
                left++;
            else if(input.charAt(i) == ')')
                right++;
        }
        System.out.println(left + " " + right);
    }
}
