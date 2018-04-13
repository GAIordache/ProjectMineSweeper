package curs.minesweeper.model;

public class Board {
	private Cell[][] mCells;
	private int mSize;
	private int mNrOfBombs;
	
	public Board (int pSize) {
		this.mSize=pSize;
		this.mNrOfBombs=pSize/4;
	}
	
	public void createBoard(int pSize) {
		mCells = new Cell[pSize][pSize];
		for (int i=0;i<pSize;i++) {
			for(int j=0;j<pSize;j++) {	
				 mCells[i][j] = new Cell();; 
			}
		}
	}
	
	public int getSize() {
		return this.mSize;			
	}
	public void setSize(int pSize) {
		this.mSize = pSize;
	}
	
	public void showBoard() {
		
	}
}
