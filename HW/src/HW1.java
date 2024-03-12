import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();

        if(day % 2 == 1)
            System.out.println("oh my god~");
        else
            System.out.println("enjoy");

        return;
    }
}
