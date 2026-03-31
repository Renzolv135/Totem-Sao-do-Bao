/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static Controller.Add_DAO.password;
import static Controller.Add_DAO.url2;
import static Controller.Add_DAO.username;
import View.CPF_GUI;
import View.Nome_GUI;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Renan
 */
public class Nota_DAO {
    public static void gerarNota() {

    try {

        Document documento = new Document();
        PdfWriter.getInstance(documento, new FileOutputStream("nota_fiscal.pdf"));
        documento.open();

        Connection con = DriverManager.getConnection(url2, username, password);

        String sql = "SELECT p.pro_nome, p.pro_preco, ped.quantidade, ped.subtotal " +
                     "FROM pedido ped " +
                     "JOIN produtos p ON ped.pro_id = p.pro_id";

        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();


        String nome = Nome_GUI.NOME_TXT.getText();
        String cpf = CPF_GUI.CPF_TXT.getText();

        if (nome.isEmpty()) nome = "Não informado";
        if (cpf.isEmpty()) cpf = "Não informado";

        documento.add(new Paragraph("NOTA FISCAL"));
        documento.add(new Paragraph("---------------------------"));
        documento.add(new Paragraph("Cliente: " + nome));
        documento.add(new Paragraph("CPF: " + cpf));
        documento.add(new Paragraph(" "));

        double total = 0;

        while (rs.next()) {

            String nomeProduto = rs.getString("pro_nome");
            double preco = rs.getDouble("pro_preco");
            int quantidade = rs.getInt("quantidade");
            double subtotal = rs.getDouble("subtotal");

            documento.add(new Paragraph("Produto: " + nomeProduto));
            documento.add(new Paragraph("Qtd: " + quantidade));
            documento.add(new Paragraph("Valor unitário: R$ " + preco));
            documento.add(new Paragraph("Subtotal: R$ " + subtotal));
            documento.add(new Paragraph("---------------------------"));

            total += subtotal;
        }

        documento.add(new Paragraph(" "));
        documento.add(new Paragraph("TOTAL: R$ " + total));

        documento.close();
        con.close();

        Desktop.getDesktop().open(new File("nota_fiscal.pdf"));

        System.out.println("PDF gerado!");

    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
