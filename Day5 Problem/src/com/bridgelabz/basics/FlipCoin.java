package com.bridgelabz.basics;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		int heads = 0;
		int Teils = 0;
		int count = 1;
		double random=0.0;


		System.out.println("Plese enter the number : ");
		Scanner n = new Scanner (System.in);
		int flips = n.nextInt();

		while (count<=flips){

			random = Math.random();
			System.out.println(count+ " " + random);

			if(random<0.5) {
				heads++;
				System.out.println("heads");
			}
			else {
				Teils++;
				System.out.println("Teils");
			}
			count++;
		}
		System.out.println();
		System.out.println("Number of heads:" +heads);
		System.out.println("Number of Teils:" +Teils);

		double headpercent = (double)heads/flips+100;
		double Teilspercent = (double)Teils/flips+100;

		System.out.println("Percentage of heads:" +headpercent);
		System.out.println("Percentage of Teils :"+ Teilspercent);

	}
}



