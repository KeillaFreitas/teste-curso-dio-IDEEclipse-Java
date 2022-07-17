package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
            
       int a, b;
       
       
       System.out.println ("Digite o primeiro Valor: ");
       a = scan.nextInt();
       System.out.println ("Digite o primeiro Valor: ");
       b = scan.nextInt();
       
       int soma = soma(a,b);
       int subtracao = subtracao(a,b);
       double divisao = Double.valueOf(a) / Double.valueOf(b) ;
       int multiplicacao = multiplicacao(a,b);
	
       System.out.println("soma " + soma);
       System.out.println("subtracao " + subtracao);
       System.out.println("divisao " + divisao);
       System.out.println("multiplicacao "+ multiplicacao);
       
	}

	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int divisao(int a, int b) {
		return a / b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	
	
	}
