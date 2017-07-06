package ships;

import util.Position;

public class Submarine extends Mine {

	private Position cell2 = new Position();
	private char orientation;
	
	public Submarine()
	{
		super();
		setOrientation('h');
		setCell2(0,1);
	}
	
	public Submarine(int x1, int y1, int x2, int y2)
	{
		super(x1, y1);
		if(x2 == x1+1 || x2 == x1-1)
			setOrientation('h');
		else
			setOrientation('v');
		setCell2(x2,y2);
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
	
	public void setCell2(int x, int y) {
		// fazer verificação se é valida a posição da cell2
		this.cell2.setX(x);
		this.cell2.setY(y);
	}
	
}
