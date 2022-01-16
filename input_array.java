import java.util.Scanner;
public class input_array {
    public static void main(String[] args) {
        int [] a = new int[5];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length ; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < a.length ; i++) {
            System.out.print(a[i]+"\t");
        }
    }
}
