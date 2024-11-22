package br.edu.fatecpg.view;

import javax.swing.*;

import br.edu.fatecpg.service.Validador;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

      
        JFrame frame = new JFrame("Cadastro de Cliente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(5, 2));

      
        JLabel nomeLabel = new JLabel("Nome do Cliente:");
        JTextField nomeField = new JTextField();
        
        JLabel idadeLabel = new JLabel("Idade:");
        JTextField idadeField = new JTextField();
        
        JLabel emailLabel = new JLabel("E-mail:");
        JTextField emailField = new JTextField();
        
        JButton cadastrarButton = new JButton("Cadastrar");

     
        frame.add(nomeLabel);
        frame.add(nomeField);
        frame.add(idadeLabel);
        frame.add(idadeField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(cadastrarButton);

        
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                  
                    String nome = nomeField.getText().trim();
                    String idadeText = idadeField.getText().trim();
                    String email = emailField.getText().trim();

                    
                    Validador.validarNome(nome);
                    int idade = Validador.validarIdade(idadeText);
                    Validador.validarEmail(email);

                    
                    JOptionPane.showMessageDialog(frame, "Cadastro realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                  
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

     
        frame.setVisible(true);
    }
}

     

