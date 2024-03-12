import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num % 2 == 0){
            System.out.println("잘못된 입력입니다. 홀수로 다시 입력해주세요");
            num = sc.nextInt();
        }
        for(int i = 1; i <= num; i += 2){
            String str = "";
            str += " ".repeat(num/2 - i /2);
            str += "*".repeat((i));
            System.out.println(str);
        }
    }
}
