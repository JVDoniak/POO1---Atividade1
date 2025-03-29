/////////////////////////////////////////////////////////
/********Programação Orientada a Objetos****************/
/************Prof. Luiz Augusto Rodrigues***************/
/*******Aluno: João Victor Doniak - Turma: Sexta********/
/////////////////////////////////////////////////////////

import java.util.Scanner;

public class ImpostoRenda {
    
    // Função para calcular o imposto bruto com base no salário do funcionário
    public static double calcularImpostoBruto(double salario, double salarioMinimo) {
        if (salario > 12 * salarioMinimo) { // Se ganha mais de 12 salários mínimos, imposto de 20%
            return salario * 0.20;
        } else if (salario > 5 * salarioMinimo) { // Se ganha mais de 5 salários mínimos, imposto de 8%
            return salario * 0.08;
        } else { // Se ganha até 5 salários mínimos, isento de imposto
            return 0.0;
        }
    }
    
    // Função para calcular o imposto total incluindo a taxa adicional de 4%
    public static double calcularImpostoTotal(double impostoBruto) {
        return impostoBruto + (impostoBruto * 0.04);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o valor do salário-mínimo
        System.out.print("Digite o valor do salário-mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();
        
        // Solicita o salário do funcionário
        System.out.print("Digite o salário do funcionário: R$ ");
        double salarioFuncionario = scanner.nextDouble();
        
        // Solicita o número de dependentes (não está sendo utilizado no cálculo, mas pode ser útil para futuras modificações)
        System.out.print("Digite o número de dependentes: ");
        int dependentes = scanner.nextInt();
        
        // Solicita o imposto já pago pelo funcionário
        System.out.print("Digite a taxa de imposto normal já paga: R$ ");
        double impostoPago = scanner.nextDouble();
        
        // Calcula o imposto bruto
        double impostoBruto = calcularImpostoBruto(salarioFuncionario, salarioMinimo);
        
        // Calcula o imposto total com a taxa adicional
        double impostoTotal = calcularImpostoTotal(impostoBruto);
        
        // Calcula o valor final a pagar, descontando o imposto já pago
        double impostoFinal = impostoTotal - impostoPago;
        
        // Exibe os resultados
        System.out.printf("Imposto bruto: R$ %.2f\n", impostoBruto);
        System.out.printf("Imposto total com taxa adicional: R$ %.2f\n", impostoTotal);
        System.out.printf("Imposto final a pagar após descontos: R$ %.2f\n", impostoFinal > 0 ? impostoFinal : 0);
        
        scanner.close();
    }
}
