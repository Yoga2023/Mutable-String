package com.types.of.string;

public class Practice {

	public static void main(String[] args) {
		
		String s= "yoga";
		String s1="babu";
		
		StringBuffer sb=new StringBuffer(s);
		int a= sb.hashCode();
		System.out.println(sb+":"+a);
		
		StringBuffer sb1=new StringBuffer(s1);
		int b= sb1.hashCode();
		System.out.println(sb1+":"+b);
		
		StringBuffer sb2=new StringBuffer();
		sb2=sb.append(sb1);
		int c= sb2.hashCode();
		System.out.println(sb2+":"+c);
		StringBuffer d=sb2.reverse();
		System.out.println(d);
		int e=d.hashCode();
		System.out.println(e);
		System.out.println(sb2.replace(2, 5, "absdf"));

		
		
		
	}

}
