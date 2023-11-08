package jebslang.window;

import java.awt.Desktop;
import java.io.File;
import jebslang.main.Main;
import jebslang.util.Logger;

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

public class DesktopManager {
	public static void openFile(File file) {
		try {
			if (!Desktop.isDesktopSupported()) {
				Logger.log.error(Main.identifier, "Opening files is not supported");
				return;
			}
			Desktop desktop = Desktop.getDesktop();
			if (file.exists()) {
				desktop.open(file);
			} else {
				Logger.log.error(Main.identifier, "File path does not exist");
				return;
			}
		} catch (Exception e) {
			Logger.log.error(Main.identifier, "Failed to open file with exception: " + e);
		}
	}
}