import java.util.Scanner;

public class VolumeTabung {
    public static double volumeTabung(double r, double h) {
        return Math.PI * r * r * h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jari-jari (cm): ");
        double r = sc.nextDouble();
        System.out.print("Tinggi (cm): ");
        double h = sc.nextDouble();

        if (r < 0 || h < 0) {
            System.out.println("Jari-jari dan tinggi harus non-negatif.");
        } else {
            double v = volumeTabung(r, h);
            System.out.printf("Volume tabung = %.4f cm^3%n", v);
        }
        sc.close();
    }
}