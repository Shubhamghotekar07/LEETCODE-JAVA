package com.tns.dayone;

public class DayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		char chr=65;
		System.out.println(chr);
		
		char var1='\u00A7';
		System.out.println(var1);
		
		byte byteMax=127; 
		byte byteMin=-128;
		System.out.println("min range of byte" + byteMin);
		System.out.println("max range of byte" + byteMax);
		
		short shortMax=32767;
		short shortMin=-32768;
		System.out.println("min range of short" + shortMin);
		System.out.println("max range of short" + shortMax);

		int intMax=2147483647;
		int intMin=-2147483648;
		System.out.println("min range of int" + intMin);
		System.out.println("max range of int" + intMax);

		long longMax=9223372036854775807L;
		long longMin=-9223372036854775808L;
		System.out.println("min range of long" + longMin);
		System.out.println("max range of long" + longMax);
	
	}

}
