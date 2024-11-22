package br.edu.fatecpg.service;

import br.edu.fatecpg.exception.EmailException;

public class Validador {


    public static void validarNome(String nome) throws IllegalArgumentException {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O campo 'Nome do Cliente' não pode ser vazio.");
        }
    }


    public static int validarIdade(String idadeText) throws NumberFormatException {
        if (idadeText.isEmpty()) {
            throw new NumberFormatException("O campo 'Idade' não pode ser vazio.");
        }
        
        try {
           
            int idade = Integer.parseInt(idadeText);
            return idade;
        } catch (NumberFormatException ex) {
            throw new NumberFormatException("O campo 'Idade' deve ser um número inteiro.");
        }
    }

  
    public static void validarEmail(String email) throws EmailException {
        if (!email.contains("@")) {
            throw new EmailException("O campo 'E-mail' deve conter o caractere '@'.");
        }
    }
}
