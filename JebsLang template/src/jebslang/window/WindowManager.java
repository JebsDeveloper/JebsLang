package jebslang.window;

import java.awt.*;
import javax.swing.*;
import jebslang.main.Main;
import jebslang.util.*;

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

public class WindowManager {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JLabel label = new JLabel();
	static JButton button = new JButton();
	
	public static void newWindow(String identifier, int width, int height) {
		Logger.log.info(Main.identifier, "Creating a new window with identifier: " + identifier);
		frame = new JFrame(identifier);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
	}
	
	public static void createText(String text, String font, int size, boolean isBold) {
		Logger.log.info(Main.identifier, "Creating text with text: \"" + text + "\", font: \"" + font + "\", size: " + size + ", bold: " + isBold);
		label = new JLabel(text);
		panel.add(label);
		if (!isBold) {
			label.setFont(new Font(font, Font.PLAIN, size));
		} else {
			label.setFont(new Font(font, Font.BOLD, size));
		}
	}
	
	public static void createButton(String text) {
		Logger.log.info(Main.identifier, "Creating a button with text: " + text);
		button = new JButton(text);
		panel.add(button);
	}
}