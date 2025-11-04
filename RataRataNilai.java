import java.util.Scanner;

public class RataRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah siswa: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah siswa harus > 0.");
            sc.close();
            return;
        }

        double total = 0.0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Nilai siswa ke-" + i + ": ");
            double nilai = sc.nextDouble();
            total += nilai;
        }

        double rata = total / n;
        System.out.printf("Rata-rata nilai %d siswa = %.2f%n", n, rata);
        sc.close();
    }
}
