package com.javaaws.exerciciosAws;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Desafio:
 *  Você está trabalhando para uma empresa que utiliza extensivamente os serviços da AWS, e após algumas análises
 *  a equipe de segurança identificou que algumas senhas dos usuários no IAM são fracas e podem representar um risco
 *  à segurança dos dados da empresa. Para resolver esse problema, foi solicitado que você desenvolva um programa capaz
 *  de analisar as senhas dos usuários e fornecer uma validação de força com base em critérios predefinidos.
 *
 * @author Emerson Melo adaptado de DIO - Java com AWS
 * @since 2023
 * */
public class VerificandoSenhas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Digite a senha para verificar a força:");
        String senha = scanner.nextLine();
        //scanner.close();

        String resultado = verificarForcaSenha(senha);
        System.out.println(resultado);
    }

    public static String verificarForcaSenha(String senha) {
        int comprimentoMinimo = 8;

        // Critérios de validação usando expressões regulares
        boolean temLetraMaiuscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean temLetraMinuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean temNumero = Pattern.compile("\\d").matcher(senha).find();
        boolean temCaractereEspecial = Pattern.compile("\\W").matcher(senha).find();
        boolean temSequenciaComum = senha.matches(".*(?i)123456.*|.*(?i)abcdef.*");
        boolean temPalavraComum = senha.equalsIgnoreCase("password") || senha.equalsIgnoreCase("123456") || senha.equalsIgnoreCase("qwerty");

        // TODO: Verifique o comprimento mínimo e critérios de validação
        List<Boolean> criteriosObrigatorios = Arrays.asList(
                temLetraMaiuscula, temLetraMinuscula,
                temNumero, temCaractereEspecial);

        if(senha.length() >= comprimentoMinimo){
            if(criteriosObrigatorios.stream().anyMatch(c -> !c) || temSequenciaComum || temPalavraComum){
                return "Sua senha nao atende aos requisitos de seguranca.";
            }else{
                return "Sua senha atende aos requisitos de seguranca. Parabens!";
            }
        }else{
            return "Sua senha e muito curta. Recomenda-se no minimo 8 caracteres.";
        }

    }
}
