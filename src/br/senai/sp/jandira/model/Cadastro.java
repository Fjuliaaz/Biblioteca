package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Cadastro {
    String nomeLivro, autor, genero;
    Scanner teclado = new Scanner(System.in);
    long ISBN;
    public void CadastrarLivros(){


        System.out.println("----- CADASTRE O LIVRO -----");

        System.out.println("Digite o nome do livro: ");
        nomeLivro = teclado.nextLine();
        System.out.println("Digite o autor: ");
        autor = teclado.nextLine();
        System.out.println("Digite o gênero do livro: ");
        genero = teclado.nextLine();
        System.out.println("Digite o ISBN: ");
        ISBN = teclado.nextLong();

        System.out.println(" --- Cadastro Realizado ---");
    }
}
