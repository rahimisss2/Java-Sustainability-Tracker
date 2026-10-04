import java.util.Scanner;

public class FoodWasteTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== 🍏 SUSTAINABLE FOOD WASTE TRACKER ===");

        // 1. Fasa Input (Mengumpul data makanan terbuang)
        System.out.print("Masukkan jenis sisa makanan (cth: Nasi, Lauk, Sayur): ");
        String jenisMakanan = input.next();

        System.out.print("Masukkan berat makanan yang terbuang (kg): ");
        double berat = input.nextDouble();

        // 2. Fasa Proses (Formula Pengiraan Kos Kerugian)
        // Anggapan purata kos penyediaan makanan ialah RM 6.50 bagi setiap 1 kg
        double kosPurataPerKg = 6.50; 
        double jumlahKerugianRM = berat * kosPurataPerKg;

        // 3. Fasa Output (Paparan Keputusan & Impak Alam Sekitar)
        System.out.println("\n----------------------------------------");
        System.out.println("📊 LAPORAN PEMBAZIRAN MAKANAN:");
        System.out.println("Jenis Sisa     : " + jenisMakanan);
        System.out.printf("Berat Terbuang : %.2f kg\n", berat);
        System.out.printf("💸 Anggaran Kerugian Kos: RM %.2f\n", jumlahKerugianRM);
        System.out.println("----------------------------------------");

        // 4. Nasihat Pengurusan Sisa Makanan
        if (berat > 5.0) {
            System.out.println("⚠️ AMARAN: Tahap pembaziran terlalu tinggi! Sila semak semula saiz hidangan atau pengurusan stok dapur.");
        } else {
            System.out.println("🌱 SYABAS: Tahap pembaziran terkawal. Teruskan amalan mengurangkan sisa makanan!");
        }
        System.out.println("========================================");

        input.close();
    }
}