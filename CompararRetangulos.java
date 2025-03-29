/////////////////////////////////////////////////////////
/********Programação Orientada a Objetos****************/
/************Prof. Luiz Augusto Rodrigues***************/
/*******Aluno: João Victor Doniak - Turma: Sexta********/
/////////////////////////////////////////////////////////

import java.util.Scanner;

public class CompararRetangulos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as dimensões do primeiro retângulo
        System.out.println("Digite as dimensões do Retângulo A:");
        System.out.print("Base (cm): ");
        int baseA = scanner.nextInt();
        System.out.print("Altura (cm): ");
        int alturaA = scanner.nextInt();

        // Solicita as dimensões do segundo retângulo
        System.out.println("Digite as dimensões do Retângulo B:");
        System.out.print("Base (cm): ");
        int baseB = scanner.nextInt();
        System.out.print("Altura (cm): ");
        int alturaB = scanner.nextInt();

        // Calcula as áreas usando a função
        int areaA = calcularArea(baseA, alturaA);
        int areaB = calcularArea(baseB, alturaB);

        // Exibe as áreas
        System.out.println("\nÁrea do Retângulo A: " + areaA + " cm²");
        System.out.println("Área do Retângulo B: " + areaB + " cm²");

        // Compara as áreas e exibe o resultado
        if (areaA > areaB) {
            System.out.println("O Retângulo A possui a maior área.");
        } else if (areaB > areaA) {
            System.out.println("O Retângulo B possui a maior área.");
        } else {
            System.out.println("Os retângulos possuem áreas iguais.");
        }

        scanner.close();
    }

    // Função para calcular a área do retângulo
    public static int calcularArea(int base, int altura) {
        return base * altura;
    }
}
