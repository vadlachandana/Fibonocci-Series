package com.spec;
//print first 10 num of fibb series
public class FibSeries {
	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.print(a+" "+b);
		for(int i=1;i<=8;i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}

}
