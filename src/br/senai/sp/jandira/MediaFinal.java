package br.senai.sp.jandira;

import java.util.Scanner;

public class MediaFinal {

	public static void main(String[] args) {
		
		//Definindo variáveis 
		
		Scanner teclado = new Scanner(System.in);
		Double bimestre1,
			bimestre2,
			bimestre3,
			bimestre4,
			media;
		
		String nome; 
		
		//Entrada de dados
		
		System.out.print("Qual é o seu nome? ");
		nome = teclado.nextLine();
		
		System.out.print("Qual a sua nota no bimestre 1? ");
	    bimestre1 = teclado.nextDouble();
		
		System.out.print("Qual a sua nota no bimestre 2? ");
	    bimestre2 = teclado.nextDouble();
		
		System.out.print("Qual a sua nota no bimestre 3? ");
		bimestre3 = teclado.nextDouble();
		
		System.out.print("Qual é a sua nota no bimestre 4? ");
	    bimestre4 = teclado.nextDouble(); 
		
		
		//Processamento de dados
		
		media = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4;
	
		//Saída de dados
		
		System.out.println("********************");
		System.out.println("     MÉDIA FINAL    ");
		System.out.println("********************");
		
		System.out.println();
		
		System.out.println("Nome do aluno" + nome);
		System.out.println("Nota do biimestre 1" + bimestre1);
		System.out.println("Nota do biimestre 2" + bimestre2);
		System.out.println("Nota do biimestre 3" + bimestre3);
		System.out.println("Nota do biimestre 4" + bimestre4);
		
		System.out.println();
		
		if (media >= 6) {
			System.out.println("--------------------------------------");
			System.out.println( nome + ", a sua nota final é " + media);
			System.out.println("PARABÉNS!! VOCÊ FOI APROVADO!!");
			System.out.println("--------------------------------------");
			
		} else {
			System.out.println("--------------------------------------");
			System.out.println( nome + ", a sua nota final é " + media);
			System.out.println("QUE PENA!! VOCÊ FOI REPROVADO!!");
			System.out.println("--------------------------------------");
			
			
		}
		
		
		
		
	}

}
