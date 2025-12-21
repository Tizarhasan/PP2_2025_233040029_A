package id.ac.unpas.pp2_2025_233040029_a.Modul10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {

    private static Connection mysqlconfig;

    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/kampus_db";
            String user = "root";
            String pass = "";

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);

        } catch (SQLException e) {
            throw new SQLException("Koneksi ke database gagal: " + e.getMessage());
        }
        return mysqlconfig;
    }
}
