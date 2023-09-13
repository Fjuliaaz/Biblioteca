package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Register {
    public static String nomeCliente;
    public static String telefone;
    Scanner teclado = new Scanner(System.in);
    public void register(){
        System.out.println("------ Insira o Cliente --------");

        System.out.println("Digite seu nome:");
        Register.nomeCliente = teclado.nextLine();
        System.out.println("Digite seu telefone:");
        Register.telefone = teclado.nextLine();

    }

}
