package br.senai.sp.jandira.model;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Operacao {

    public int numero = 1;

    Register register = new Register();

    Cadastro cadastro = new Cadastro();
    public List<Operacao> produtos = new ArrayList<>();

    public void exibirPedido() {
        System.out.println("-----------------------------------------------------");
        System.out.println("Pedido: " + numero);
        System.out.println("-----------------------------------------------------");
        System.out.println("Livro do pedido: ");
        System.out.println(cadastro.nomeLivro);
        }


            }