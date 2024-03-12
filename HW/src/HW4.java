import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        int num = 1;
        int flag = 1;
        while(num < 41){
            if(!chknum(num, flag)){
                System.out.println("컴퓨터 승!");
                System.out.println("게임종료");
                break;
            }
            num++;
            flag++;
        }
        if(num == 41){
            System.out.println("무승부!");
        }
    }
    public static boolean chknum(int n, int flag){
        Scanner sc = new Scanner(System.in);
        String num = String.valueOf(n);
        while(num.contains("3") || num.contains("6") || num.contains("9")){
            num = num.replace("3", "X");
            num = num.replace("6", "X");
            num = num.replace("9", "X");
        }
        if(flag % 2 == 1){
            System.out.println("컴퓨터 : " + num);
            return true;
        }else {
            System.out.print("나 : ");
            String input = sc.next();
            if(input.equals(num))
                return true;
            else
                return false;
        }
    }
}
