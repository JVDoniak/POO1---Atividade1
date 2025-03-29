/////////////////////////////////////////////////////////
/********Programação Orientada a Objetos****************/
/************Prof. Luiz Augusto Rodrigues***************/
/*******Aluno: João Victor Doniak - Turma: Sexta********/
/////////////////////////////////////////////////////////

import java.util.Scanner;

public class DuracaoJogo {
    public static void calcularDuracao(int horaInicio, int minutoInicio, int horaFim, int minutoFim, int[] duracao) {
        int inicioTotalMinutos = horaInicio * 60 + minutoInicio;
        int fimTotalMinutos = horaFim * 60 + minutoFim;
        
        // Se a hora final for menor que a inicial, significa que passou da meia-noite
        if (fimTotalMinutos < inicioTotalMinutos) {
            fimTotalMinutos += 24 * 60;
        }
        
        int totalMinutos = fimTotalMinutos - inicioTotalMinutos;
        duracao[0] = totalMinutos / 60; // Horas
        duracao[1] = totalMinutos % 60; // Minutos
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a hora de início: ");
        int horaInicio = scanner.nextInt();
        System.out.print("Digite os minutos de início: ");
        int minutoInicio = scanner.nextInt();
        System.out.print("Digite a hora de término: ");
        int horaFim = scanner.nextInt();
        System.out.print("Digite os minutos de término: ");
        int minutoFim = scanner.nextInt();
        
        int[] duracao = new int[2];
        calcularDuracao(horaInicio, minutoInicio, horaFim, minutoFim, duracao);
        
        System.out.println("Duração do jogo: " + duracao[0] + " horas e " + duracao[1] + " minutos.");
        
        scanner.close();
    }
}
