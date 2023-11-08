package jebslang.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

public class Logger {
	public class log {
		static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
		static LocalDateTime now = LocalDateTime.now();
		
		public static void info(String identifier, String message) {
			System.out.println(Color.GREEN + "INFO: [" + identifier + "] (" + dtf.format(now) + "): " + message + Color.RESET);
		}
		
		public static void error(String identifier, String message) {
			System.out.println(Color.RED + "ERROR: [" + identifier + "] (" + dtf.format(now) + "): " + message + Color.RESET);
		}
		
		public static void fatal(String identifier, String message) {
			System.out.println(Color.RED + "FATAL: [" + identifier + "] (" + dtf.format(now) + "): " + message + Color.RESET);
		}
		
		public static void warn(String identifier, String message) {
			System.out.println(Color.YELLOW + "WARN: [" + identifier + "] (" + dtf.format(now) + "): " + message + Color.RESET);
		}
		
		public static void severe(String identifier, String message) {
			System.out.println(Color.RED + "SEVERE: [" + identifier + "] (" + dtf.format(now) + "): " + message + Color.RESET);
		}
	}
}