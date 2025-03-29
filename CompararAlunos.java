/////////////////////////////////////////////////////////
/********Programação Orientada a Objetos****************/
/************Prof. Luiz Augusto Rodrigues***************/
/*******Aluno: João Victor Doniak - Turma: Sexta********/
/////////////////////////////////////////////////////////

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class CompararAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário
        
        // Solicita ao usuário o número de alunos e alunas
        System.out.print("Digite o número de alunos: ");
        int numAlunos = scanner.nextInt();
        
        System.out.print("Digite o número de alunas: ");
        int numAlunas = scanner.nextInt();
        
        // Compara os valores e exibe a saída conforme solicitado
        if (numAlunos > numAlunas) {
            System.out.println("Alunos: " + numAlunos);
            System.out.println("Alunas: " + numAlunas);
        } else if (numAlunas > numAlunos) {
            System.out.println("Alunas: " + numAlunas);
            System.out.println("Alunos: " + numAlunos);
        } else {
            System.out.println("Quantidade igual de alunos e alunas: " + numAlunos);
        }
        
        scanner.close(); // Fecha o Scanner para evitar vazamento de recursos
    }
}
