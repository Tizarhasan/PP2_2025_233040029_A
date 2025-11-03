package id.ac.unpas.pp2_2025_233040029_a.Modul4;

/**
 *
 * @author tizarhasan
 */

public class Lingkaran extends BangunDatar {
    private double radius;

    public Lingkaran(double radius) {
        this.radius = radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Ini adalah Lingkaran, Radius: " + radius);
    }
}
