/////////////////////////////////////////////////////////
/********Programação Orientada a Objetos****************/
/************Prof. Luiz Augusto Rodrigues***************/
/*******Aluno: João Victor Doniak - Turma: Sexta********/
/////////////////////////////////////////////////////////

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os números ao usuário
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        int num2;
        do {
            System.out.print("Digite o segundo número inteiro (diferente do primeiro): ");
            num2 = scanner.nextInt();
            if (num1 == num2) {
                System.out.println("Os números devem ser distintos. Tente novamente.");
            }
        } while (num1 == num2);

        // Chama a função para obter o maior número
        int maior = maiorNumero(num1, num2);
        System.out.println("O maior número é: " + maior);

        scanner.close();
    }

    // Função para verificar o maior número
    public static int maiorNumero(int a, int b) {
        return (a > b) ? a : b;
    }
}
