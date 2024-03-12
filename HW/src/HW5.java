import java.util.Random;

public class HW5 {
    public static void main(String[] args) throws InterruptedException {
        int flag = 0;
        int i = 1;
        while(flag != 3){
            System.out.println(i + "번 타자");
            flag += playgame();
            i++;
        }
        System.out.println("게임 종료");
    }

    public static int playgame() throws InterruptedException {
        Random r = new Random();
        int ball = 0;
        int strike = 0;
        while (true){
            Thread.sleep(1000);
            int num = r.nextInt(2) - 1;
            if(num == 0){
                System.out.println("스트라이크!");
                strike++;
            }else{
                System.out.println("볼!");
                ball++;
            }
            if (strike == 3) {
                System.out.println("3진 아웃");
                return 1;
            }
            else if(ball == 4) {
                System.out.println("1루 진루");
                return 0;
            }
        }
    }
}
