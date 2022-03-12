/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author David
 */
public class AdmonCalculadora extends JFrame implements ActionListener {

    private JButton btnsuma, btnresta, btnmulti, btndiv, btnlimpiar, btnsalir;
    private JTextField valor1, valor2, camporesultado;
    JLabel label1, label2, label3;

    public void Controles() {
        Container contenedor = getContentPane();
        contenedor.setLayout(new FlowLayout());
        label1 = new JLabel("Numero 1");
        contenedor.add(label1);
        valor1 = new JTextField(10);
        contenedor.add(valor1);
        label2 = new JLabel("Numero 2");
        contenedor.add(label2);
        valor2 = new JTextField(10);
        contenedor.add(valor2);
        btnsuma = new JButton("+");
        contenedor.add(btnsuma);
        btnsuma.addActionListener(this);
        btnresta = new JButton("-");
        contenedor.add(btnresta);
        btnresta.addActionListener(this);
        btnmulti = new JButton("x");
        contenedor.add(btnmulti);
        btnmulti.addActionListener(this);
        btndiv = new JButton("/");
        contenedor.add(btndiv);
        label3 = new JLabel("Resultado:");
        contenedor.add(label3);
        btndiv.addActionListener(this);
        camporesultado = new JTextField(10);
        contenedor.add(camporesultado);
        label3 = new JLabel("Resultado:");
        btnlimpiar = new JButton("Limpiar");
        contenedor.add(btnlimpiar);
        btnlimpiar.addActionListener(this);
        btnsalir = new JButton("salir");
        btnsalir.addActionListener(this);
        btnsalir.setBackground(Color.blue);
        contenedor.add(btnsalir);
        btnsalir.addActionListener(this);

    }

    public AdmonCalculadora() {
        super("AdmonCalculadora");
        Controles();
        setSize(380, 200);
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1, num2, resu;
        String resultado;
        if (e.getSource() == btnsuma) {
            if (valor1.getText().equals("") || valor2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Los datos no estan completos",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                num1 = Double.parseDouble(valor1.getText());
                num2 = Double.parseDouble(valor2.getText());
                resu = num1 + num2;
                resultado = String.valueOf(resu);
                camporesultado.setText(resultado);
            }
        }
        if (e.getSource() == btnresta) {
            if (valor1.getText().equals("") || valor2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Los datos no estan completos",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                num1 = Double.parseDouble(valor1.getText());
                num2 = Double.parseDouble(valor2.getText());
                resu = num1 - num2;
                resultado = String.valueOf(resu);
                camporesultado.setText(resultado);
            }
        }
        if (e.getSource() == btnmulti) {
            if (valor1.getText().equals("") || valor2.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Los datos no estan completos",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                num1 = Double.parseDouble(valor1.getText());
                num2 = Double.parseDouble(valor2.getText());
                resu = num1 * num2;
                resultado = String.valueOf(resu);
                camporesultado.setText(resultado);
            }
        }
        if (e.getSource() == btndiv) {
            if (valor1.getText().equals("") || valor2.getText().equals("") || valor1.getText().equals("0") || valor2.getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "Los datos no estan escritos correctamente o datos erroneos",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                num1 = Double.parseDouble(valor1.getText());
                num2 = Double.parseDouble(valor2.getText());
                resu = num1 / num2;
                resultado = String.valueOf(resu);
                camporesultado.setText(resultado.toString());

            }

        }

        if (e.getSource() == btnlimpiar) {
            valor1.setText("");
            valor2.setText("");
            camporesultado.setText("");
        }
        if (e.getSource() == btnsalir) {
            System.exit(0);
        }
    }

}
