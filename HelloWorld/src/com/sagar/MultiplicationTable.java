package com.sagar;

public class MultiplicationTable {
	
	
	static void Table(int n) {
		
		for(int i=1;i<=10;i++) {
			
			System.out.printf("%d x %d=%d",n,i,n*i);
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		
		Table(17);
		
	}

}
