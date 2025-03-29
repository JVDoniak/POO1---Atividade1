/////////////////////////////////////////////////////////
/********Programação Orientada a Objetos****************/
/************Prof. Luiz Augusto Rodrigues***************/
/*******Aluno: João Victor Doniak - Turma: Sexta********/
/////////////////////////////////////////////////////////

#include <stdio.h>

int main() {
    float kg_morango, kg_maca, preco_morango, preco_maca, total, desconto;
    
    // Entrada de dados
    printf("Digite a quantidade de morangos (Kg): ");
    scanf("%f", &kg_morango);
    
    printf("Digite a quantidade de macas (Kg): ");
    scanf("%f", &kg_maca);
    
    // Definição de preços por Kg
    if (kg_morango > 5)
        preco_morango = 5.30;
    else
        preco_morango = 7.50;
    
    if (kg_maca > 5)
        preco_maca = 2.80;
    else
        preco_maca = 3.50;
    
    // Cálculo do total
    total = (kg_morango * preco_morango) + (kg_maca * preco_maca);
    
    // Aplicação de desconto, se necessário
    if ((kg_morango + kg_maca) <= 5 && total > 19.00) {
        desconto = total * 0.08;
        total -= desconto;
    }
    
    // Saída do resultado
    printf("Valor a ser pago: R$ %.2f\n", total);
    
    return 0;
}
