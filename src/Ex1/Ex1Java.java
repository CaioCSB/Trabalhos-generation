package Ex1;

import java.util.Scanner;

public class Ex1Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int dia,mes,ano,anof;
		System.out.println("Dia em que você nasceu? ");
		dia = ler.nextInt();
		System.out.println("Mês em que você nasceu? ");
		mes = ler.nextInt();
		System.out.println("Ano em que você nasceu? ");
		ano = ler.nextInt();
		anof = dia + mes*30 + ano*365;
		System.out.println("Você viveu: "+anof+" Dias");
	}
}
