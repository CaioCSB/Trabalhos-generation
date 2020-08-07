package Ex3;

import java.util.Scanner;

public class Ex3Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int seg,min,hr;
		System.out.println("Tempo em segundos de evento: ");
		seg = ler.nextInt();
		hr = seg/3600;
		min = seg/60;
		System.out.println("Tempo em horas:");
		System.out.println(hr);
		System.out.println("Tempo em minutos:");
		System.out.println(min);
		System.out.println("Tempo em segundos:");
		System.out.println(seg);	
	}
}
