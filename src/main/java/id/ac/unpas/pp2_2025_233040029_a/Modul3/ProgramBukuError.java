package id.ac.unpas.pp2_2025_233040029_a.Modul3;

/**
 *
 * @author tizarhasan
 */

public class ProgramBukuError {
    public static void main(String[] args) {
        Buku buku = new Buku("Pemrograman Java Dasar", "Andi", 150);

        // 10. Perbaikan: gunakan getter untuk mengakses jumlahHalaman
        System.out.println("Akses jumlahHalaman (via getter): " + buku.getHalaman());
    }
}
