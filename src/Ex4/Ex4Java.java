package Ex4;

import java.util.Scanner;

public class Ex4Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int num1,num2,num3,cal,R,S,D;
		System.out.println("Primeiro n�mero:");
		num1 = ler.nextInt();
		System.out.println("Segundo n�mero:");
		num2 = ler.nextInt();
		System.out.println("Terceiro n�mero:");
		num3 = ler.nextInt();
		
		R = (num1+num2)*2;
		S = (num2+num3)*2;
		D = (R+S)/2;
		cal = D;
		System.out.println("O Resultado �:");
		System.out.println(cal);
	}
}
