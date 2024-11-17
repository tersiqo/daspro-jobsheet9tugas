import java.util.Scanner;

public class Tugas1_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int jumlahMhs = input.nextInt();

        int[] nilai = new int[jumlahMhs];

        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextInt();
        }

        int totalNilai = 0;
        for (int nilaiMhs : nilai) {
            totalNilai += nilaiMhs;
        }
        double rataRata = (double) totalNilai / jumlahMhs;

        int nilaiTertinggi = nilai[0];
        int nilaiTerendah = nilai[0];
        for (int nilaiMhs : nilai) {
            if (nilaiMhs > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs;
            }
            if (nilaiMhs < nilaiTerendah) {
                nilaiTerendah = nilaiMhs; 

            }
        }

        System.out.println("\nHasil:");
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.print("Semua    nilai: ");
        for (int nilaiMhs : nilai) {
            System.out.print(nilaiMhs + " ");
        }
    }
}