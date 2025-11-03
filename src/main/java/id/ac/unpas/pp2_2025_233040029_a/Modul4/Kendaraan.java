package id.ac.unpas.pp2_2025_233040029_a.Modul4;

/**
 *
 * @author tizarhasan
 */

public class Kendaraan {
  protected String merk;
  protected int tahun;
  protected String pintu;

  public Kendaraan(String merk, int tahun, String pintu) {
    this.merk = merk;
    this.tahun = tahun;
    this.pintu = pintu;
  }

  public void klakson() {
    System.out.println("Tin Tin!");
  }

  public void info() {
    System.out.println("Merk: " + merk + ", Tahun: " + tahun);
    System.out.println("Jumlah Pintu: " + pintu);
  }
}
