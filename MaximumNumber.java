package com.bridzelabz.maximumNumbers;

public class MaximumNumber {

	int a,b,c;
	MaximumNumber(int a, int b , int c){
		this.a =a ;
		this.b = b;
		this.c = c;
		System.out.println("The numbers are : " + a + " " + b + " " +c);

		if((this.a > this.b) && (this.a > this.c))
		{
			System.out.println(a + " is the greatest");
		}
		else if( this.b > this.c)
		{
			System.out.println(b + " is the greatest");
		}
		else
		{
			System.out.println(c + " is the greatest");
		}

	}

	public static void main(String[] args) {
		MaximumNumber m1 = new MaximumNumber(44,54,85);


	}
}
