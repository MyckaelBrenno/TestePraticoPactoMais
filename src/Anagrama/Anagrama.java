package Anagrama;
import java.util.Scanner;

/*Esse Programa � um Anagrama que faz as seguintes verifica��es: V�o ser inseridas duas palavras, se suas letras forem iguais,
ele retorna verdadeiro, se forem diferentes retorna falso, e se for n�mero, dar� a quantidade de pulos do n�mero informado 
at� o pr�ximo caractere*/

public class Anagrama {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String p1 = "";
		String p2 = "";
		
		System.out.println("Digite a primeira palavra: ");
		p1 = ler.next();
		System.out.println("Digite a segunda palavra (letras e numeros)");
		p2 = ler.next();

		char[] c1 = p1.toCharArray();
		char[] c2 = p2.toCharArray();

		int a;
		int b;

		int diferenca = c1.length - c2.length; // variavel para aumentar o tamanho do segundo indice(c2) quando a palavra do segundo for menor que a do primeiro

		for (a = 0, b = 0; a < c1.length && b < c2.length + diferenca; a++, b++) { //percorre as duas arrays de char na mesma posi��o

			try {
				if (c1[a] == c2[b]) {  //verifica se � igual
					System.out.println("�ndice " + a + " � verdadeiro");
					
				} else if (Character.isDigit(c2[b])) { //Se n�o for igual, verifica se � numero
					int pulo = Character.getNumericValue(c2[b]); //armazena o valor do caractere na variavel pulo

					System.out.println("Pulo: " + pulo);
					if (pulo >= 2) {
						a = a + (pulo - (diferenca)); //se pulo for >= 2 ele incrementa no indice (a), porque se ele for menor j� vai pular automaticamente, por conta do contador
					}
					//System.out.println(a + " : " + b);

				} else if (c1[a] != c2[b]) { //se n�o for igual e nem n�mero, vai ser letra, e letras diferentes retorna falso
					System.out.println("�ndice " + a + " � falso");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ndice " + a + " � falso");
			}
		}

		ler.close();
	}

}
