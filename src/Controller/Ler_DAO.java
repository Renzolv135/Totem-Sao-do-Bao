/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.Add_DAO.password;
import static Controller.Add_DAO.url2;
import static Controller.Add_DAO.username;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Renan
 */
public class Ler_DAO {
    public static double calcularTotal() {

    double total = 0;

    try {

        Connection con = DriverManager.getConnection(url2, username, password);

        String sql = "SELECT SUM(subtotal) AS total FROM pedido";

        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            total = rs.getDouble("total");
        }

        con.close();

    } catch (Exception e) {
        e.printStackTrace();
    }

    return total;
}
}
