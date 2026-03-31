package Controller;

import static Controller.Add_DAO.password;
import static Controller.Add_DAO.url2;
import static Controller.Add_DAO.username;
import static View.Geral_GUI.subtotal_txt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class DESC_DAO {

    public static void Desc1() {

    try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url2, username, password);

        String sql = "UPDATE pedido SET subtotal = subtotal - 2.5 WHERE subtotal > 0";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.executeUpdate();

        con.close();

        JOptionPane.showMessageDialog(null, "Desconto aplicado!");

    } catch (Exception e) {

        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao aplicar desconto!");

    }
}
    public static void Desc2() {

    try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url2, username, password);

        String sql = "UPDATE pedido SET subtotal = subtotal - 3.0 WHERE subtotal > 0";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.executeUpdate();

        con.close();

        JOptionPane.showMessageDialog(null, "Desconto aplicado!");

    } catch (Exception e) {

        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao aplicar desconto!");

    }
}
    public static void Desc3() {

    try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url2, username, password);

        String sql = "UPDATE pedido SET subtotal = subtotal - 1.5 WHERE subtotal > 0";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.executeUpdate();

        con.close();

        JOptionPane.showMessageDialog(null, "Desconto aplicado!");

    } catch (Exception e) {

        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao aplicar desconto!");

    }
}
    public static void Desc4() {

    try {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url2, username, password);

        String sql = "UPDATE pedido SET subtotal = subtotal - 5.5 WHERE subtotal > 0";
        PreparedStatement pst = con.prepareStatement(sql);

        pst.executeUpdate();

        con.close();

        JOptionPane.showMessageDialog(null, "Desconto aplicado!");

    } catch (Exception e) {

        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao aplicar desconto!");

    }
}
}