/////////////////////////////////////////////////////////
/********Programação Orientada a Objetos****************/
/************Prof. Luiz Augusto Rodrigues***************/
/*******Aluno: João Victor Doniak - Turma: Sexta********/
/////////////////////////////////////////////////////////

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class ConversorTemperatura {
    // Função para converter Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário
        
        // Solicita a temperatura ao usuário
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble(); // Lê o valor digitado pelo usuário
        
        // Converte a temperatura
        double fahrenheit = celsiusParaFahrenheit(celsius);
        
        // Exibe o resultado na tela
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        
        scanner.close(); // Fecha o Scanner para evitar vazamento de recursos
    }
}
