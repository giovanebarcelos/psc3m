package avaliacao_a1;

import java.util.Scanner;

/*
A102) (1,0 ponto) O Índice de Massa Corporal (IMC)
 é calculado usando a fórmula:
IMC = peso / (altura)^2.
Ex: peso = 70, altura = 1.75 → IMC = 22.86
Faça um programa que leia o peso, a altura e o sexo
da pessoa (M para masculino, F para feminino) e
retorne uma String indicando a condição corporal,
conforme tabela padrão do IMC
 */
public class A102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Peso (kg): ");
        float peso = scanner.nextFloat();
        System.out.print("Altura (metros): ");
        float altura = scanner.nextFloat();
        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().toUpperCase().charAt(0);

        String condicao = "Obesidade Mórbida";
        float imc = peso / (altura * altura);

        if (sexo == 'M'){
            if (imc < 20 ){
                condicao = "Abaixo do peso";
            } else if (imc < 25){
                condicao = "Normal";
            } else if (imc < 30){
                condicao = "Sobrepeso";
            } else if (imc < 40){
                condicao = "Obsidade";
            }
        } else if (sexo == 'F'){
            if (imc < 19 ){
                condicao = "Abaixo do peso";
            } else if (imc < 24){
                condicao = "Normal";
            } else if (imc < 29){
                condicao = "Sobrepeso";
            } else if (imc < 39){
                condicao = "Obsidade";
            }
        }

        System.out.printf("IMC %.2f para peso %.2f e altura %.2f do sexo %s indica %s",
               imc, peso, altura, sexo, condicao);
    }
}
