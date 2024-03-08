package array;

public class array6 {
    public static void main(String[] args) {
        int a[][]={{1, 2, 3}, {3, 4, 5}};
        for(int i =0; i <a.length; i++){
            for(int j = 0; i < a[i].length; j++){
                System.out.print(a[i][j]);
            }
        }

        for(int [] arr:a){
            for(int num : arr){
                System.out.println(num + " ");
            }
        }
    }
}
