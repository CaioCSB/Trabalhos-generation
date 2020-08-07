package Ex7;

import java.util.Scanner;

public class Ex7Java {
	public static void main (String Args[])
	{
		Scanner ler = new Scanner(System.in);
		float a,b,c,d,e,f,x,y;
		
		System.out.println("Coloque o Valor de A:");
		a = ler.nextFloat();
		System.out.println("Coloque o Valor de B:");
		b = ler.nextFloat();
		System.out.println("Coloque o Valor de C:");
		c = ler.nextFloat();
		System.out.println("Coloque o Valor de D:");
		d = ler.nextFloat();
		System.out.println("Coloque o Valor de E:");
		e = ler.nextFloat();
		System.out.println("Coloque o Valor de F:");
		f = ler.nextFloat();
		
		x = (c*e - b*f)/(a*e - b*d);
		y = (a*f - c*d)/(a*e - b*d);
		System.out.println("O Valor de X:");
		System.out.println(x);
		System.out.println("O Valor de Y:");
		System.out.println(y);
	}
}
