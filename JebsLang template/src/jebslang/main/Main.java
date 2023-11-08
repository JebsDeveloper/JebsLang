package jebslang.main;

import java.util.Scanner;

/*
 * Copyright (c) 2023 JebsDeveloper
 * 
 * This is a java-based language used by calling existing
 * methods/functions. This template is licensed under the
 * MIT license meaning you may use it but you must include
 * the license (MIT) and copyright notice
 * 
 * You may remove this comment
 * 
 * Github: https://github.com/JebsDeveloper/JebsLang
 */

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static String input;
	public static final String identifier = "JebsLang";
	
	public static void print(String message) {
		System.out.print(message);
	}
	
	public static void println(String message) {
		System.out.println(message);
	}
	
	public static void br() {
		System.out.println("");
	}
	
	public static void input() {
		input = scanner.next();
	}
}