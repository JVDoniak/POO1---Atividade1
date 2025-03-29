/////////////////////////////////////////////////////////
/********Programação Orientada a Objetos****************/
/************Prof. Luiz Augusto Rodrigues***************/
/*******Aluno: João Victor Doniak - Turma: Sexta********/
/////////////////////////////////////////////////////////

import java.util.Scanner;

public class ContaAgua {
    
    public static double calcularResidencial(double consumo) {
        return 5.00 + (consumo * 0.05);
    }
    
    public static double calcularComercial(double consumo) {
        if (consumo <= 80) {
            return 500.00;
        } else {
            return 500.00 + ((consumo - 80) * 0.25);
        }
    }
    
    public static double calcularIndustrial(double consumo) {
        if (consumo <= 100) {
            return 800.00;
        } else {
            return 800.00 + ((consumo - 100) * 0.04);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a conta do cliente: ");
        String conta = scanner.nextLine();
        
        System.out.print("Digite o consumo de água em m³: ");
        double consumo = scanner.nextDouble();
        
        System.out.println("Escolha o tipo de consumidor:");
        System.out.println("1 - Residencial");
        System.out.println("2 - Comercial");
        System.out.println("3 - Industrial");
        System.out.print("Opção: ");
        int tipo = scanner.nextInt();
        
        double valorConta = 0;
        
        switch (tipo) {
            case 1:
                valorConta = calcularResidencial(consumo);
                break;
            case 2:
                valorConta = calcularComercial(consumo);
                break;
            case 3:
                valorConta = calcularIndustrial(consumo);
                break;
            default:
                System.out.println("Opção inválida.");
                scanner.close();
                return;
        }
        
        System.out.println("Conta do Cliente: " + conta);
        System.out.printf("Valor a ser pago: R$ %.2f\n", valorConta);
        
        scanner.close();
    }
}
