package Ex1;

import java.util.Scanner;

public class Ex1Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int dia,mes,ano,anof;
		System.out.println("Dia em que voc� nasceu? ");
		dia = ler.nextInt();
		System.out.println("M�s em que voc� nasceu? ");
		mes = ler.nextInt();
		System.out.println("Ano em que voc� nasceu? ");
		ano = ler.nextInt();
		anof = dia + mes*30 + ano*365;
		System.out.println("Voc� viveu: "+anof+" Dias");
	}
}
