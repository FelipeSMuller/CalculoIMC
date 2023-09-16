package Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Calculadora de IMC: Crie um programa que pede ao usuário seu peso e altura e
		 * calcula o Índice de Massa Corporal (IMC).
		 */

		int peso;
		Double altura, imc;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua altura : ");

		altura = sc.nextDouble();

		System.out.println("Digite seu peso : ");

		peso = sc.nextInt();
		imc = (peso / (altura * altura));

		System.out.println(
				" Seu peso e : " + peso + " e sua altura e : " + altura + " seu imc e igual a = " + Math.round(imc));

		if (imc < 18.5) {
			System.out.println("Voce esta abaixo do peso!! ");

		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println(" Peso saudavel!! ");

		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println(" Sobrepeso !!");

		} else {
			System.out.println(" Obesidade!! ");

		}

		sc.close();
	}

}
