package curs.minesweeper.model;

public final class Menu {
	
	public static void ShowStartMenu () {
		System.out.println("Welcome to MineSweeper 1.0\n");
		System.out.println(" Begin - press B\n Save - press S\n Load - press L\n Score - press C\n Exit - press E");
	}
	
	public static void ShowInGameMenu () {
		System.out.println("-------------------------------------------------------");
		System.out.println(" Save - press S\n Show Cheat Board - press C\n Exit - press E");
		System.out.println("Choose target - (example B9)");
	}
	
	
}
