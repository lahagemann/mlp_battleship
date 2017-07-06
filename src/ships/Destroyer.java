package ships;

import util.*;

public class Destroyer extends Mine {
	
	private Position cell2 = new Position();
	private Position cell3 = new Position();
	private char orientation;
	
	public Destroyer()
	{
		super();
		setOrientation('h');
		setCell2(0,1);
	}
	
	public Destroyer(int x1, int y1, int x2, int y2, int x3, int y3)
	{
		if(x2 == x1+1 || x2 == x1-1)
			setOrientation('h');
		else
			setOrientation('v');
		setCell1(x1, y1);
		setCell2(x2,y2);
		setCell3(x3,y3);
	}
	
	public void setOrientation(char orientation) {
		if(orientation == 'v')
			this.orientation = orientation;
		else
			this.orientation = 'h';
	}
	
	public void setCell2(Position cell2) {
		// fazer verificação se é valida a posição da cell2
		this.cell2 = cell2;
	}
	
	public void setCell3(Position cell3) {
		// fazer verificação se é valida a posição da cell3
		this.cell3 = cell3;
	}
	
	public void setCell1(int x, int y) {
		this.setPosition(x, y);
	}
	
	public void setCell2(int x, int y) {
		// fazer verificação se é valida a posição da cell2
		this.cell2.setX(x);
		this.cell2.setY(y);
	}
	
	public void setCell3(int x, int y) {
		// fazer verificação se é valida a posição da cell3
		this.cell3.setX(x);
		this.cell3.setY(y);
	}

}
