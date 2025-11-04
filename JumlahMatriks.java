import java.util.Scanner;

public class JumlahMatriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dimensi
        System.out.print("Jumlah baris: ");
        int r = sc.nextInt();
        System.out.print("Jumlah kolom: ");
        int c = sc.nextInt();

        if (r <= 0 || c <= 0) {
            System.out.println("Dimensi harus positif.");
            sc.close();
            return;
        }

        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] C = new int[r][c];

        System.out.println("Masukkan elemen matriks A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Masukkan elemen matriks B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = sc.nextInt();
            }
        }

        // Penjumlahan
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        // Tampilkan hasil
        System.out.println("\nHasil A + B =");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
