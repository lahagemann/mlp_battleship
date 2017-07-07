package ships;

public class Mine extends Ship {
	
	public Mine()
	{
		setPosition(0,0);
		setIsDown(false);
	}
	
	public Mine(int x, int y)
	{
		setPosition(x,y);
		setIsDown(false);
	}
	
	public boolean hitThisShip(int x, int y) {
		if(x == this.getPosition().getX() && y == this.getPosition().getY()) {
			this.setIsDown(true);
			return true;
		}
		
		return false;
	}
}
