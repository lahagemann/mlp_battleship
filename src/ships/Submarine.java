package ships;

import util.Position;

public class Submarine extends Mine {

	private Position cell2;
	private char orientation;
	
	private boolean hitCell1;
	private boolean hitCell2;
	
	public Submarine()
	{
		super();
		this.cell2 = new Position();
		setOrientation('h');
		setCell2(0,1);
		setHitCell1(false);
		setHitCell2(false);
	}
	
	public Submarine(int x1, int y1, int x2, int y2)
	{
		super(x1, y1);
		this.cell2 = new Position();
		
		if(x2 == x1+1 || x2 == x1-1)
			setOrientation('h');
		else
			setOrientation('v');
		
		setCell2(x2,y2);
		setHitCell1(false);
		setHitCell2(false);
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
	
	private void setHitCell1(boolean isHit) {
		this.hitCell1 = isHit;
	}
	
	private void setHitCell2(boolean isHit) {
		this.hitCell2 = isHit;
	}
	
	public boolean hitThisShip(int x, int y) {
		if(x == this.getPosition().getX() && y == this.getPosition().getY()) {
			if(this.hitCell2)
				this.setIsDown(true);
			this.setHitCell1(true);
			return true;
		} else if(x == this.cell2.getX() && y == this.cell2.getY()) {
			if(this.hitCell1)
				this.setIsDown(true);
			this.setHitCell2(true);
			return true;
		}
		
		return false;
	}
	
}
