
class ThingOnMap {
	
	protected int CoordX, CoordY, Speed;
	protected GameMap CatchMap;
	protected char Simbol;
	
	
	
	ThingOnMap(int coordX, int coordY) {		
		this.CoordX = coordX;
		this.CoordY = coordY;		
	};

	void move(int Direction) {
		
	}

	public int getCoordX() {
		return CoordX;
	}

	public int getCoordY() {
		return CoordY;
	}
		
	public char getSimbol() {
		return Simbol;
	}

	public void setCatchMap(GameMap catchMap) {
		CatchMap = catchMap;
	}	
	
}

class Catсher extends ThingOnMap{

	Catсher(int coordX, int coordY) {
		super(coordX, coordY);
		this.Simbol = '©';		
	}	
	
}