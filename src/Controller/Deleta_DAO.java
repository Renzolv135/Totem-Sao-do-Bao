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
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class Deleta_DAO {
    public static void cancelarPedido() {

    try {

        Connection con = DriverManager.getConnection(url2, username, password);

        String sql = "DELETE FROM pedido";

        PreparedStatement pst = con.prepareStatement(sql);
        pst.executeUpdate();

        JOptionPane.showMessageDialog(null, "Pedido cancelado com sucesso!");

        con.close();

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Erro ao cancelar pedido!");
        e.printStackTrace();
    }
}
}
