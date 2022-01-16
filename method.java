import java.util.Scanner;
public class method {
    public static void print (int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
    public static void insert(int ar[]){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            ar [i]=in.nextInt();
        }
    }

    public static void main(String[] args) {
        int [] a = new int[5];
        insert(a);
        print(a);
    }
}
