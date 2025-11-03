package id.ac.unpas.pp2_2025_233040029_a.Modul6;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContohFlowLayout {
    public static void main(String[] args){
        // 1. Buat frame 
        JFrame frame = new JFrame("Contoh FlowLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        
        // 2. Buat Panel (Container)
        JPanel panel = new JPanel();
        
        // 3. Buat dan tambahkan komponen
        panel.add(new JButton("Tombol 1"));
        panel.add(new JButton("Tombol 2"));
        panel.add(new JButton("Tombol Tiga"));
        panel.add(new JButton("Tombol Empat Panjang"));
        panel.add(new JButton("Tombol 5"));
        
        // 4. Tambahkan panel ke frame
        frame.add(panel);
        
        // 5. Tampilkan frame
        frame.setVisible(true);
    }
}
