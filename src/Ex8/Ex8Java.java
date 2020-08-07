package Ex8;

import java.util.Scanner;

public class Ex8Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		float custof,custoc;
		
		System.out.println("Coloque o custo do fabricante:");
		custof = ler.nextFloat();
		
		custoc = (float) (custof+(custof*0.73));
		System.out.println("Custo ao consumidor"+custoc);
	}
}
