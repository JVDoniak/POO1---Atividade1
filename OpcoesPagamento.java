/////////////////////////////////////////////////////////
/********Programação Orientada a Objetos****************/
/************Prof. Luiz Augusto Rodrigues***************/
/*******Aluno: João Victor Doniak - Turma: Sexta********/
/////////////////////////////////////////////////////////

import java.util.Scanner;

public class OpcoesPagamento {
    
    public static int escolherOpcao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção de pagamento:");
        System.out.println("1 - À vista com 10% de desconto");
        System.out.println("2 - Em duas vezes (preço normal)");
        System.out.println("3 - De 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$ 100,00)");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        return opcao;
    }

    public static void pagamentoAVista(double total) {
        double totalComDesconto = total * 0.90;
        System.out.printf("Valor final com desconto: R$ %.2f\n", totalComDesconto);
    }

    public static void pagamentoDuasVezes(double total) {
        System.out.printf("Duas parcelas de: R$ %.2f\n", total / 2);
    }

    public static void pagamentoParcelado(double total) {
        if (total <= 100) {
            System.out.println("Compra abaixo de R$ 100,00 não pode ser parcelada em 3 ou mais vezes.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escolha o número de parcelas (de 3 a 10): ");
        int parcelas = scanner.nextInt();
        
        if (parcelas < 3 || parcelas > 10) {
            System.out.println("Número de parcelas inválido.");
            return;
        }
        
        double totalComJuros = total * Math.pow(1.03, parcelas);
        System.out.printf("Total com juros: R$ %.2f\n", totalComJuros);
        System.out.printf("%d parcelas de R$ %.2f\n", parcelas, totalComJuros / parcelas);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o total gasto pelo cliente: R$ ");
        double total = scanner.nextDouble();
        
        int opcao = escolherOpcao();
        
        switch (opcao) {
            case 1:
                pagamentoAVista(total);
                break;
            case 2:
                pagamentoDuasVezes(total);
                break;
            case 3:
                pagamentoParcelado(total);
                break;
            default:
                System.out.println("Opção inválida.");
        }
        
        scanner.close();
    }
}
