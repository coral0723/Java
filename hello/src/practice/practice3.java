package practice;

class Point{
	private int x, y;
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class ColorPoint extends Point{
	String color;
	int x;
	int y;
	ColorPoint(){
		super(0,0);
		this.color = "BLACK";
	}
	ColorPoint(int x, int y){
		super(x,y);
	}
	ColorPoint(int x, int y, String color){
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		move(x, y);
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String toString() {
		return color+"색의 ("+getX()+","+getY()+")의 점";
	}
}

class Point3D extends Point{
	int z;
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	public String toString() {
		return "("+getX()+","+getY()+","+z+")의 점";
	}
	public void moveUp() {
		this.z += 1;
	}
	public void moveDown() {
		this.z -= 1;
	}
	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
}

class PositivePoint extends Point{
	PositivePoint(){
		super(0, 0);
	}
	PositivePoint(int x, int y){
		super(x, y);
		if (x < 0 || y<0) {
			super.move(0, 0);
		}
		
	}
	public void move(int x, int y) {
		if(x>=0 && y>=0) {
			super.move(x, y);
		}
	}
	public String toString() {
		return "("+getX()+","+getY()+")의 점";
	}
}
public class practice3 {

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
		System.out.println(p.toString() + "입니다.");

		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}

}
