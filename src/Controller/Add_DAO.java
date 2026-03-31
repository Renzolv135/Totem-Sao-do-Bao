package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Add_DAO {

    public static String url2 = "jdbc:mysql://localhost:3307/totem_fastfood";
    public static String username = "root";
    public static String password = "";

    public static void adicionarProduto(String nome) {

        try {

            if (nome == null || nome.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nome do produto inválido!");
                return;
            }

           
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(url2, username, password);

            String sqlBusca = "SELECT pro_id, pro_preco FROM produtos WHERE LOWER(pro_nome) = LOWER(?)";
            PreparedStatement pstBusca = con.prepareStatement(sqlBusca);
            pstBusca.setString(1, nome.trim());

            ResultSet rs = pstBusca.executeQuery();

            if (rs.next()) {

                int pro_id = rs.getInt("pro_id");
                double preco = rs.getDouble("pro_preco");

                int quantidade = 1;
                double subtotal = preco * quantidade;

                String sqlInsert = "INSERT INTO pedido (pro_id, quantidade, subtotal) VALUES (?, ?, ?)";
                PreparedStatement pstInsert = con.prepareStatement(sqlInsert);

                pstInsert.setInt(1, pro_id);
                pstInsert.setInt(2, quantidade);
                pstInsert.setDouble(3, subtotal);

                pstInsert.executeUpdate();

                JOptionPane.showMessageDialog(null, nome + " adicionado!");

            } else {

                JOptionPane.showMessageDialog(null, "Produto não encontrado no banco!");

            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro real: " + e.getMessage());

        }
    }
}