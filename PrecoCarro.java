/////////////////////////////////////////////////////////
/********Programação Orientada a Objetos****************/
/************Prof. Luiz Augusto Rodrigues***************/
/*******Aluno: João Victor Doniak - Turma: Sexta********/
/////////////////////////////////////////////////////////

import java.util.Scanner;

public class PrecoCarro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o preço inicial do carro ao usuário
        System.out.print("Digite o preço inicial de fábrica do carro: R$ ");
        double precoInicial = scanner.nextDouble();
        double precoFinal = precoInicial;
        
        System.out.println("Escolha os opcionais desejados (digite 's' para selecionar e 'n' para ignorar):");
        
        // Verifica se o usuário deseja adicionar ar-condicionado
        System.out.print("Ar-condicionado (R$ 1750,00)? (s/n): ");
        if (scanner.next().equalsIgnoreCase("s")) {
            precoFinal += 1750;
        }
        
        // Verifica se o usuário deseja adicionar pintura metálica
        System.out.print("Pintura Metálica (R$ 800,00)? (s/n): ");
        if (scanner.next().equalsIgnoreCase("s")) {
            precoFinal += 800;
        }
        
        // Verifica se o usuário deseja adicionar vidro elétrico
        System.out.print("Vidro Elétrico (R$ 1200,00)? (s/n): ");
        if (scanner.next().equalsIgnoreCase("s")) {
            precoFinal += 1200;
        }
        
        // Verifica se o usuário deseja adicionar direção hidráulica
        System.out.print("Direção Hidráulica (R$ 2000,00)? (s/n): ");
        if (scanner.next().equalsIgnoreCase("s")) {
            precoFinal += 2000;
        }
        
        // Exibe o preço final do carro com os opcionais escolhidos
        System.out.printf("Preço final do carro: R$ %.2f\n", precoFinal);
        
        scanner.close();
    }
}
