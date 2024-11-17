import java.util.Scanner;

public class Tugas3_22 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama makanan yang ingin Anda cari: ");
        String makananDicari = input.nextLine().trim();

        if (makananDicari.isEmpty()) {
            System.out.println("Input tidak boleh kosong. Silakan masukkan nama makanan.");
        } else {
            for (String makanan : menu) {
                if (makanan.equalsIgnoreCase(makananDicari)) {
                    System.out.println("Makanan " + makananDicari + " tersedia di menu.");
                    input.close();
                    return;
                }
            }

            System.out.println("Maaf, makanan " + makananDicari + " tidak tersedia di menu.");
        }
    }
}