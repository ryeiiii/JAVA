import java.util.Scanner;
import java.math.BigInteger;

public class Faktorial {
    public static BigInteger faktorial(int n) {
        BigInteger hasil = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            hasil = hasil.multiply(BigInteger.valueOf(i));
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif (n >= 0): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("n harus >= 0.");
        } else {
            BigInteger f = faktorial(n);
            System.out.println(n + "! = " + f);
        }
        sc.close();
    }
}
