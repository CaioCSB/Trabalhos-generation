package Ex2;

import java.util.Scanner;

public class Ex2Java {
	public static void main (String args[])
	{	
		Scanner ler = new Scanner(System.in);
		int td,anos,meses,dias;
		System.out.println("Sua idade em dias: ");
		td = ler.nextInt();
		anos = td/365;
		meses = (td%365)/30;
		dias = (td%365)%30;
		System.out.println(dias);
		System.out.println(meses);
		System.out.println(anos);
	}
}
