package curs.minesweeper.controller;

import java.util.Scanner;

import curs.minesweeper.model.Board;
import curs.minesweeper.model.Menu;

public class Game {
	private String userInput;
	
	public void start() {
		Menu.ShowStartMenu();
		this.decisionBasedOnUserInput(this.getUserInput());
	}
	
	public String getUserInput() {
		Scanner sc = new Scanner(System.in);
		userInput = sc.next();
		return userInput;
	}
	
	public void decisionBasedOnUserInput(String pInput) {
		if(pInput.equals("B")) {
			this.beginGame();
		}
		if(pInput.equals("S")) {
			
		}
		if(pInput.equals("L")) {
			
		}
		if(pInput.equals("C")) {
			
		}
		if(pInput.equals("E")) {
			this.exitGame();
		}
		
	}
	
	private void beginGame() {
		Board tableDeJoc = new Board(10);
		tableDeJoc.createBoard(tableDeJoc.getSize());
		tableDeJoc.showBoard();
		Menu.ShowInGameMenu();
		this.decisionBasedOnUserInputDuringGame(this.getUserInput());
	}

	private void decisionBasedOnUserInputDuringGame(String pUserInput) {
		if(pUserInput.equals("S")) {
			
		}
		if(pUserInput.equals("C")) {
			
		}
		if(pUserInput.equals("E")) {
			this.exitGame();
		}else {
			
		}
		
	}

	public static void exitGame() {
		System.exit(0);
	}

}
