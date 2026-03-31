package Controller;

import static Controller.Add_DAO.password;
import static Controller.Add_DAO.url2;
import static Controller.Add_DAO.username;
import static View.Geral_GUI.subtotal_txt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Busca_DAO {

    public static void refresh() {

        try {

            Connection conn = DriverManager.getConnection(url2, username, password);

            double total = 0;

            String sqlTotal = "SELECT SUM(subtotal) AS total FROM pedido";
            PreparedStatement pstTotal = conn.prepareStatement(sqlTotal);
            ResultSet rsTotal = pstTotal.executeQuery();

            if (rsTotal.next()) {
                total = rsTotal.getDouble("total");
            }

            subtotal_txt.setText(String.format("%.2f", total));

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}