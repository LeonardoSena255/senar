package tarea3;

import java.util.Scanner;

public class Serie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1=0,num2=0,suma=0,i=1;
		System.out.println("Ingrese el primer numero:");
		num1 = in.nextInt();
		System.out.println("Ingrese el segundo numero:");
		num2 = in.nextInt();
		do {
			System.out.println(suma);
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
			i++;
		}while(i<=10);
	}

}
