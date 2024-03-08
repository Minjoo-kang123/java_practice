package array;

import java.util.Arrays;

public class array3 {
    public static void main(String[] args) {
        Customer [] customers = new Customer[3];
        customers[0] = new Customer("id01", "pwd01", "name1");
        customers[1] = new Customer("id02", "pwd02", "name2");
        customers[2] = new Customer("id03", "pwd03", "name3");

        for(Customer c : customers){
            System.out.println(c.toString());
        }
    }
}
