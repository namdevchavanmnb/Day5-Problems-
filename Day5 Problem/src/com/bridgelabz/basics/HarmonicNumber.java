package com.bridgelabz.basics;

public class HarmonicNumber {
	public static void main(String arg[])
	{
		double n=10,i;
		double sum=0;	
		for( i=1;i<=n;i++)
		{
			sum=sum +(1/i);
		}
		System.out.println("Harmonic Number = "+sum);
	}
}


