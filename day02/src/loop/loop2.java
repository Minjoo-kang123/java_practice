package loop;

public class loop2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0;i<10;i++){
            sum += i;
        }
        System.out.println(sum);
        System.out.println("----------");

        int i = 0;
        int sum2 = 0;
        while(i < 10){
            sum2+= i;
            i++;
        }
        System.out.println(sum2);
        System.out.println("----------");
    }
}
