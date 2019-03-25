package com.techm.sush;

public class FormattingDemo {
	
	public static void main(String[] args) {
		int sushil=10;
		int suchita=20;
		int sagar=30;
		int kiran=40;
		double avgNumber;
		String s1="My friends numbers are "+sushil+", "+suchita+", "+sagar+", "+kiran+" thank you";
		System.out.println(s1);
		
		//String formatting simplifies complexity of above String s1
		//Using format method of String class:
		String s2=String.format("My friends numbers are %d, %d, %d, %d thank you", sushil,suchita,sagar,kiran);
		System.out.println(s2);
		
		//finding avg of num in double give 0.############# result
		avgNumber=((kiran-sagar)+(sagar-suchita)+(suchita-sushil)/3.0d);
		String s3="the average sum of numbers is "+avgNumber+" thanks.";
		System.out.println(s3);
		
		//removing or formatting num after decimal by formatting
		String s4=String.format("the average sum of numbers is %.2f thanks.", avgNumber);
		System.out.println(s4);
		
		String s5=String.format("%d",32);
		String s6=String.format("%o",32);
		String s7=String.format("%x",32);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		
		//representation in their format as dec octal n hex format by "#"
		String s8=String.format("%d",32);
		String s9=String.format("%#o",32);
		String s10=String.format("%#x",32);
		System.out.println(s8);
		System.out.println(s9);
		System.out.println(s10);
		
		//for alignment purpose we uses format flags as
		//Unalined
		String ss1=String.format("W:%d X:%d",12,455);
		String ss2=String.format("W:%d X:%d",455,12);
		
		//taking 4 places
		String ss3=String.format("W:%4d X:%4d",12,455);
		String ss4=String.format("W:%4d X:%4d",455,12);
		
		//taking 4 places and empty as 0
		String ss5=String.format("W:%04d X:%04d",12,455);
		String ss6=String.format("W:%04d X:%04d",455,12);
		
		//taking 4 places and left alined
		String ss7=String.format("W:%-4d X:%-4d",12,455);
		String ss8=String.format("W:%-4d X:%-4d",455,12);
		
		//positive and negative no alignment
		String ss9=String.format("W:% d ",12);//%space d is used to align.
		String ss10=String.format("W:%d",-12);
		
		System.out.println("Unalined");
		System.out.println(ss1);
		System.out.println(ss2);
		System.out.println("taking 4 places");
		System.out.println(ss3);
		System.out.println(ss4);
		System.out.println("taking 4 places and empty as 0");
		System.out.println(ss5);
		System.out.println(ss6);
		System.out.println("taking 4 places and left alined");
		System.out.println(ss7);
		System.out.println(ss8);
		System.out.println("positive and negative no alignment");
		System.out.println(ss9);
		System.out.println(ss10);
		
		String a1=String.format("%d,%d,%d",100,200,300);
		//no+$ specifies that, that no's argument is asign to to value
		String a2=String.format("%3$d,%1$d,%2$d",100,200,300);
		//  < is used to indicate taking previous value here ex is 300
		String a3=String.format("%3$d,%<04d,%2$d",100,200,300);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}

}
