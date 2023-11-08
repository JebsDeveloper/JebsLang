package com.example.exampleprogram;

import java.io.*;
import jebslang.main.*;
import jebslang.window.*;
import jebslang.util.*;

/*
 * Copyright (c) 2023 JebsDeveloper
 * 
 * This is a java-based language used by calling existing
 * methods/functions. This template is licensed under the
 * MIT license meaning you may use it but you must include
 * the license (MIT) and copyright notice
 * 
 * This is the template class, you may change this class's
 * contents, name, package and whatever you want to change
 * 
 * any edits in the JebsLang source code are permitted but
 * is risky as you may break the entire program
 * 
 * You may remove this comment
 * 
 * Github: https://github.com/JebsDeveloper/JebsLang
 */

public class ExampleProgram extends Main {
	public static void main(String[] args) {
		
		/*
		 * You can only use JebsLang in any Java class that imports:
		 * 
		 * jebslang.main.*;
		 * jebslang.window.*;
		 * jebslang.util.*;
		 * 
		 * and if opening files using DesktopManager:
		 * 
		 * java.io.*;
		 * 
		 * (for the "new File(PATH)")
		 * 
		 * It is optional but recommended that your class extends Main (from jebslang.main)
		 * Example: public class YOURPROGRAM extends Main
		 * 
		 * The reason it is optional is you can use print("message"), println("message"), br(), or input
		 * without having to type Main.print("message"), Main.println("message"), Main.br(), of input()
		 * 
		 * Remember you can use any Java knowledge to create methods/functions, variables and more stuff with
		 * Java since it is Java based
		 */
		
		/*
		 * VERY IMPORTANT NOTE!!!!!
		 * 
		 * FOR ANYONE WHO DOES NOT WANT COMMENTS
		 * CLOGGING UP THEIR TEMPLATE, YOU CAN
		 * USE THE COMMENT-FREE GITHUB REPOSITORY
		 * FOR JEBSLANG FOUND AT https://github.com/JebsDeveloper/JebsLang-Comment-Free
		 */
		
		// This uses the JebsLang logger to log the info "Starting Program". The "identifier" part is an already declared variable holding the String/text: "JebsLang".
		// The variable is declared in jebslang.main Main.java. You can change it if you want.
		Logger.log.info(identifier, "Starting Program");
		WindowManager.newWindow(identifier, 1000, 500);
		// the basic structure of a WindowManager text creation is: "TEXT TO BE DISPLAYED", "FONT", SIZE, IS BOLD (true/false)
		WindowManager.createText("JebsLang!", "Verdana", 25, false);
		WindowManager.createText("Welcome to JebsLang! JebsLang is a Java-based programing language that is made by calling", "Verdana", 18, false);
		WindowManager.createText("functions/methods from the JebsLang template! You can use an already made Logger for", "Verdana", 18, false);
		WindowManager.createText("debugging and easily create windows and elements using WindowManager!", "Verdana", 18, false);
		WindowManager.createText("Using DesktopManager, you can even open files on a user's computer if you have a file path", "Verdana", 18, false);
		// You can cleverly make blank spaces by setting some text to lots of spaces. But if you change the size of a window, It might break your whole layout.
		WindowManager.createText("                                            ", "Verdana", 18, false);
		WindowManager.createText("All this code is licenced under the MIT license (see https://choosealicense.com/licenses/mit/)", "Verdana", 18, false);
		WindowManager.createText("and you can find this template on the github repository (see", "Verdana", 18, false);
		WindowManager.createText("https://github.com/JebsDeveloper/JebsLang)", "Verdana", 18, false);
		WindowManager.createText("This is the comment version, if you already know", "Verdana", 18, false);
		WindowManager.createText("JebsLang, you may find always deleting trillions", "Verdana", 18, false);
		WindowManager.createText("of comments on every template annoying. Then get", "Verdana", 18, false);
		WindowManager.createText("the comment-free version at", "Verdana", 18, false);
		WindowManager.createText("https://github.com/JebsDeveloper/JebsLang-Comment-Free", "Verdana", 18, false);
		WindowManager.createText("                                                                                           ", "Verdana", 18, false);
		WindowManager.createText("You must include somewhere clear, in your program,", "Verdana", 18, false);
		WindowManager.createText("the license (MIT) and the copyright notice (2023", "Verdana", 18, false);
		WindowManager.createText("JebsDeveloper on Github). It is optional but appreciated, if you would leave the link to", "Verdana", 18, false);
		WindowManager.createText("my Github. Thank you.", "Verdana", 18, false);
		// You can open files as long as you have a file path but make sure your file paths must be "new File(PATH)" and all slashes or backslashes should be doubled
		DesktopManager.openFile(new File("FILE PATH HERE"));
		
		// You can use println (print line) to print text and start a new line but it is not recommended because JebsLang uses the JebsLang logger in some cases
		println("message");
		
		// You can also print messages in the console but it is not recommended because JebsLang uses the JebsLang logger in some cases
		print("message");
		
		// You can use the br(); to print an empty line
		br();
		
		// You can print messages in color using the Color class in jebslang.util. The basic structure is: Color.COLOR + MESSAGE + Color.RESET. Sadly, you can't use the WindowManager.createText function with Color
		println(Color.BLUE + "This message is in the color blue!" + Color.RESET);
		
		// You can use the logger.log method to log something under an identifier. This logging level is INFO. It prints in green. INFO is typically used for keeping track of things going on in your program
		Logger.log.info("Identifier", "message");
		
		// This logging level is WARN. It prints in yellow. WARN is typically used for things that don't have a huge impact on your program but still might cause some part to not work properly
		Logger.log.warn("Identifier", "message");   
		
		// This logging level is ERROR. It prints in red. ERROR is typically used when a big part of your program fails to load or something similar
		Logger.log.error("Identifier", "message");
		
		// This logging level is SEVERE. It prints in red. FATAL is typically used when something completely fails to load or just doesn't work
		Logger.log.severe("Identifier", "message");
		
		// This logging level is FATAL. It prints in red. FATAL is typically used for an error that can break your whole program
		Logger.log.fatal("Identifier", "message");
		
		// You can use input to get the user's text input from the console
		input();
		
		// You can later access that input through Main's input variable
		println("You typed: " + input);
		
		// You can also add buttons to the screen using WindowManager.createButton(TEXT);
		// Although it's possible, I wouldn't recommend it because there are no action listeners
		
	}
}