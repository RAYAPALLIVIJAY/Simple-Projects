package com;

public class Main {

	public static void main(String[] args) {
		
		Operations.createMainFolderIfNotPresent("Folder");
		
		Menue.printWelcomeScreen("Welcome to The Program", "Hai,I'm Vijay");
		
		Display.handleWelcomeScreenInput();
	}

	
}
