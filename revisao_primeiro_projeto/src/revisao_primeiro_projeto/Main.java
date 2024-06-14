package revisao_primeiro_projeto;

import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int d, e, f;
		
		d = sc.nextInt();
		e = sc.nextInt();
		f = sc.nextInt();
		
		int higher = num(d, e, f);
		
		System.out.println(higher);
			
		sc.close();
	}
	
	public static int num(int a, int b, int c) {
		
		int maior;
		
		if (a > b && a > c) {
			
			maior = a;
		}
		else if (b > c) {
			
			maior = b;
		}
		else {
			
			maior = c;
		}
		
		return maior;
	}
}