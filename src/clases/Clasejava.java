package clases;

import java.util.Scanner;

public class Clasejava {
	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		
		int num;
		
		System.out.println("Dime un número: ");
		num = scaner.nextInt();
		
		if(num % 2 == 0) {
			System.err.println("El número es par");
		}else {
			System.err.println("El número es impar");
		}
		
	}

}
