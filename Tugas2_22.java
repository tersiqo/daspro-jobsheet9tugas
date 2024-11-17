import java.util.Scanner;

public class Tugas2_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan ke-" + (i+1) + ": ");
            namaPesanan[i] = input.next();
            System.out.print("Masukkan harga pesanan ke-" + (i+1) + ": Rp ");
            hargaPesanan[i] = input.nextDouble();
        }

        double totalBiaya = 0;
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println((i+1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
            totalBiaya += hargaPesanan[i];
        }
        System.out.println("Total Biaya: Rp " + totalBiaya);

    }
}