package atividade_fila;

import java.util.LinkedList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        LinkedList<String> fila = new LinkedList<>();

        while (true) {
            System.out.println("""
                    ********************************************************************
                    
                            1 - Adicionar Clientes na Fila
                            2 - Listar todos os clientes
                            3 - Retirar Clientes da Fila
                            0 - Sair
                    
                    ********************************************************************
                    Entre com a opção desejada:
                    """);
            int opcao = read.nextInt();
            read.skip("\\R?");

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome:");
                    fila.add(read.nextLine());

                    System.out.println("Fila: \n");
                    for (String pessoa : fila) {
                        System.out.println(pessoa);
                    }
                    System.out.println("Cliente Adicionado!\n");
                    break;
                case 2:
                    System.out.println("Lista de Clientes na Fila: \n");
                    for (String pessoa : fila) {
                        System.out.println(pessoa);
                    }
                    break;
                case 3:
                    fila.remove();
                    if (fila.isEmpty()) {
                        System.out.println("A Fila está vazia!");
                    } else {
                        System.out.println("Fila: \n");
                        for (String pessoa : fila) {
                            System.out.println(pessoa);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Programa Finalizado!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção invalida!!");
                    break;
            }
        }

    }
}
