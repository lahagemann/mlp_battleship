package ships;

import util.*;

public abstract class Ship {
	private Position cell;
	private boolean isHit;
	
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
}
