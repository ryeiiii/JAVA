import java.util.Scanner;

public class KirimPaket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // untuk menginput
        System.out.print("Berat paket (kg): ");
        double berat = sc.nextDouble();
        System.out.print("Jarak tempuh (km): ");
        double jarak = sc.nextDouble();
        System.out.print("Panjang (cm): ");
        double p = sc.nextDouble();
        System.out.print("Lebar (cm): ");
        double l = sc.nextDouble();
        System.out.print("Tinggi (cm): ");
        double t = sc.nextDouble();

        //perhitungan
        double volume = p * l * t;
        int tarifPerKg = (jarak <= 10) ? 4250 : 6000;
        double biayaUtama = berat * tarifPerKg;
        int biayaTambahan = (volume > 100) ? 50000 : 0;
        double total = biayaUtama + biayaTambahan;

        System.out.println("\n--- RINCIAN ---");
        System.out.printf("Volume: %.2f cm^3%n", volume);
        System.out.printf("Tarif per kg: Rp %,d%n", tarifPerKg);
        System.out.printf("Biaya utama: Rp %,.0f%n", biayaUtama);
        System.out.printf("Biaya tambahan volume: Rp %,d%n", biayaTambahan);
        System.out.printf("TOTAL: Rp %,.0f%n", total);

        sc.close();
    }
}
