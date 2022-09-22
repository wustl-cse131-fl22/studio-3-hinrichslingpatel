package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many values would you like to evaluate? ");
		int n = in.nextInt();
		
		boolean[] sieve = new boolean[n];
		
		for (int i = 0; i < n; i++)
		{
			sieve[i] = true; 
		}
		
		for (int a = 2; a < n; a++) {
			for (int i = 2 * a; i < n; i = i + a) {
				sieve[i] = false;
			}
		}
	
		for (int all = 0; all <= n; all++)
		{
			System.out.println(sieve[all]);
		}
	}

}
