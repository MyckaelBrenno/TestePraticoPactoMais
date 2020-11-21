package Anagrama;

import java.util.Scanner;

//Esse programa dir� se as palavras s�o anagramas ou n�o

public class AnagramaValido {
	public static void main(String[] args) {

		String p1 = "", p2 = "";
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a primeira palavra: ");
		p1 = ler.next();
		System.out.println("Informe a segunda palavra: ");
		p2 = ler.next();
		
		if (Anagrama(p1, p2)){ //verifica a condi��o do m�todo
			System.out.println("� anagrama!");
		} else {
			System.out.println("N�o � anagrama!");
		}
		ler.close();
	}
	
	public static boolean Anagrama(String p1, String p2) {
		int resultado = 0;
		
		for (int i = 0; i < p1.length(); i++) {
				resultado = resultado ^ p1.charAt(i); //Operador XOR(^) se e somente se os dois itens forem diferentes, retorna true
		}
		for (int i = 0; i < p2.length(); i++) {
			resultado = resultado ^ p2.charAt(i); //se o resultado for diferente da posi��o (i), ele retorna '0', verdadeiro
												  //No segundo for, todas as posi��es de p1 j� foram percorridas
		}
		return (resultado == 0); //verifica se resultado � verdadeiro

	}
}
