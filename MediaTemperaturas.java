package com.vitorcamara.projetos;

import java.util.Scanner;

public class MediaTemperaturas {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double media = 0;
		double soma = 0;
		double temp = 0;
		double maior = Double.MIN_VALUE; //'maior' recebe o menor valor possível para um double
		double menor = Double.MAX_VALUE; ////'menor' recebe o maior valor possível para um double

		System.out.println("Entre com a quantidade de temperaturas:");
		int qtdTemperaturas = scan.nextInt();

		for (int i = 1; i <= qtdTemperaturas; i++) {
			soma += temp;
			System.out.println("Entre com a temperatura " + i + ":");
			temp = scan.nextDouble();

			if (temp > maior) {
				maior = temp; // o último maior valor informado ficará armazenado
			}

			if (temp < menor) {
				menor = temp; // o último menor valor informado ficará armazenado
			}
		}

		media = soma / qtdTemperaturas;

		System.out.println("A soma das temperaturas: " + soma);
		System.out.println("A média das temperaturas: " + media + " graus");
		System.out.println("A maior temperatura: " + maior + " graus");
		System.out.println("A menor temperatura: " + menor + " graus");

	}

}
