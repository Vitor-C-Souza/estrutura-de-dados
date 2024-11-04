package atividade_pilha;

import java.util.Scanner;
import java.util.Stack;

public class Application {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Stack<String> pilha = new Stack<>();

        while (true) {
            System.out.println("""
                    ********************************************************************
                    
                            1 - Adicionar Louça suja
                            2 - Mostrar a Louça suja
                            3 - Retirar Louça suja
                            0 - Sair
                    
                    ********************************************************************
                    Entre com a opção desejada:
                    """);
            int opcao = read.nextInt();
            read.skip("\\R?");
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome:");
                    pilha.push(read.nextLine());

                    System.out.println("Pilha: ");
                    for (String louca : pilha) {
                        System.out.println(louca);
                    }

                    System.out.println("Louça adicionada!");
                    break;
                case 2:
                    System.out.println("Mostrando a Louça suja: ");
                    for (String louca : pilha) {
                        System.out.println(louca);
                    }
                    break;
                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A louça suja foi lavada ou nunca existiu!!!");
                    } else {
                        pilha.pop();

                        System.out.println("Pilha: ");
                        for (String louca : pilha) {
                            System.out.println(louca);
                        }
                    }
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
