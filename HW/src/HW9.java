import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int cor = r.nextInt(1,100);

        System.out.println("번호를 입력하세요");
        int num = sc.nextInt();
        while(cor != num){
            if(num > cor)
                System.out.println("번호가 정답보다 큽니다.");
            else
                System.out.println("번호가 정답보다 작습니다.");

            System.out.println("번호를 입력하세요");
            num = sc.nextInt();
        }
        System.out.println("정답입니다.");
    }
}
