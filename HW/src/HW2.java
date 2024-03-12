import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        boolean[] chk = new boolean[46];
        Random r = new Random();
        int i = 0;

        while(i != 6){
            int num = r.nextInt(45) + 1;
            System.out.print(num + " ");
            if(!chk[num]){
                i++;
                chk[num] = true;
            }else{
                System.out.print("중복발생 재추첨! ");
            }
        }
    }
}
