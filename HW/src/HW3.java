import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num < 1 || num >= 11){
            System.out.println("잘못된 입력입니다. 다시 입력해주세요");
            num = sc.nextInt();
        }
        for(int i = 1; i <= num; i++){
            if(i % 3 == 0)
                System.out.println("X ");
            else
                System.out.println(i + " ");
        }
    }
}
