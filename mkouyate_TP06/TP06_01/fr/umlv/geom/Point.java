

public class Point {
	protected int x;
	protected int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "(" + x + ',' + y + ')';
	}
	
	public void translate(int dx, int dy) {
	  x += dx;
	  y += dy;
	}
}