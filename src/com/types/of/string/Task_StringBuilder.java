package com.types.of.string;

public class Task_StringBuilder {
	public static void main(String[] args) {
		String a = "selenium starts";
		String b = "selenium starts";

		StringBuilder sb = new StringBuilder(a);
		int c = sb.hashCode();
		System.out.println("String 1: " + c);

		StringBuilder sb1 = new StringBuilder(b);
		int d = sb1.hashCode();
		System.out.println("String 1: " + d);

		StringBuilder sb2 = new StringBuilder();
		sb2 = sb.append(sb1);
		int e = sb2.hashCode();
		System.out.println("Concatinated String: "+sb2+" "+e);

	}
}
