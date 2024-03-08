package loop;


import java.util.Scanner;

public class loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("input command ...(q,c,r,u,d)");
            String cmd = sc.next();
            if (cmd.equals("q")){
                System.out.println("bYe");
                sc.close();
                break;
            }
            switch (cmd){
                case "c" : System.out.println("Create"); break;
                case "r" : System.out.println("Read")
                // hello
                ;
                case "u" : System.out.println("Update"); break;
                case "d" : System.out.println("Delete"); break;
                default: System.out.println("Try again");
            }
        }
        System.out.println("END...");
    }
}
