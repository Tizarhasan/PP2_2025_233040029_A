package id.ac.unpas.pp2_2025_233040029_a.Modul8;

import id.ac.unpas.pp2_2025_233040029_a.Modul8.Controller.PersegiPanjangController;
import id.ac.unpas.pp2_2025_233040029_a.Modul8.Model.PersegiPanjangModel;
import id.ac.unpas.pp2_2025_233040029_a.Modul8.View.PersegiPanjangView;

public class Main {
  public static void main(String[] args) {
    // 1. instalasi model
    PersegiPanjangModel model = new PersegiPanjangModel();

    //2. instalasi view
    PersegiPanjangView view = new PersegiPanjangView();

    //3. instalasi controller (hubungkan model dan view)
    PersegiPanjangController controller = new PersegiPanjangController(model, view);

    // 4. tampilkan UI
    view.setVisible(true);
  }
}
