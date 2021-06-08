package com.uno.algoritmia.fibonacc.model;

public class Fibonacci {

	private String nombre;

	public Fibonacci(String nombre) {
		this.nombre = nombre;
	}

	public Long getValueInFibonacciSequence(Integer n) {
		long num1 = 0;
		long num2 = 1;
		long suma = 0;
		for (int i = 1; i < n; i++) {
			System.out.println(suma);
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}

		return num2;
	}

	public String getChallenge() {
		String mensaje = "N�mero de Fibonacci\n" +

				" Descripci�n \n" + "El objetivo es desarrollar un algoritmo \n"
				+ "eficiente para encontrar n n�mero de la serie de Fibonacci.\n "
				+ "La sucesi�n de Fibonacci es una secuencia de numeros en la que cada\n "
				+ "n�mero de la serie se calcula a partir de la formula general F_i = Fi_i-1 + F_i-2\n" + "Objetivo \n"
				+ "Dado un entero n, encontrar el n�mero de la secuencia de Fibonacci que se encuentra en\n "
				+ "esa posici�n (F_n)\n" + "  Formato\n" + "Formato de Entrada: Consiste en un solo n�mero entero n\n" +

				"Formato de Salida: El n�mero de la serie que se halla en la posici�n n\n" +

				"  Ejemplo \n" + "Input: 10\n" + "Output: 55\n" +

				"  Condiciones" + "0 <= n <= 45";

		return mensaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
