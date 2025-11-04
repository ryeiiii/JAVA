import java.util.Scanner;

public class Gnjlgnp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " adalah GENAP.");
        } else {
            System.out.println(n + " adalah GANJIL.");
        }
        sc.close();
    }
}
