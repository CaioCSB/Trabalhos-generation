package Ex6;

import java.util.Scanner;

public class Ex6Java {
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		float x1,x2,y1,y2,D;
		
		System.out.println("X1:");
		x1 = ler.nextFloat();
		System.out.println("X2:");
		x2 = ler.nextFloat();
		System.out.println("Y1:");
		y1 = ler.nextFloat();
		System.out.println("Y2:");
		y2 = ler.nextFloat();
		
		D = (float) (Math.sqrt(x2 - x1)*2 + Math.sqrt(y2 - y1)*2);
		
		System.out.println("O resultado é:");
		System.out.println(D);
	}
}
