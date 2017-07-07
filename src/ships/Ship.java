package ships;

import util.*;

public abstract class Ship {
	private Position cell = new Position();
	private boolean isDown;
	
	public Position getPosition() {
		return cell;
	}
	
	public void setPosition(Position position) {
		this.cell = position;
	}
	
	public void setPosition(int x, int y) {
		cell.setX(x);
		cell.setY(y);
	}
	
	public boolean isShipDown() {
		return this.isDown;
	}
	
	public void setIsDown(boolean isDown) {
		this.isDown = isDown;
	}
}
