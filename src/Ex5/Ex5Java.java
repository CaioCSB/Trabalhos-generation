package Ex5;

import java.util.Scanner;

public class Ex5Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		float nota1,nota2,nota3,mp;
		System.out.println("Primeira nota:");
		nota1 = (float) ler.nextFloat();
		System.out.println("Segunda nota:");
		nota2 = (float) ler.nextFloat();
		System.out.println("Terceira nota:");
		nota3 = (float) ler.nextFloat();
		mp = (float) (nota1*2 + nota2*3 + nota3*5)/10;
		System.out.println("Sua nota é:");
		System.out.println(mp);
	}
}
