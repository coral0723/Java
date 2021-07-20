package practice;

class TV{
	private int size;
	public TV(int size){
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	int color;
	public ColorTV(int inch, int color){
		super(inch);
		this.color = color;
	}
	void printProperty() {
		System.out.print(getSize() + "��ġ " + color + "�÷�");
	}
}

class IPTV extends ColorTV{
	private String address;
	IPTV(String address, int size, int color){
		super(size, color);
		this.address = address;
	}
	void printProperty() {
		System.out.print("���� IPTV�� "+address+" �ּ���"+getSize()+"��ġ "+color+"�÷�");
	}
}

public class Practice {

	public static void main(String[] args) {
		IPTV myTV = new IPTV("192.1.1.2", 32, 1024);
		myTV.printProperty();

	}

}
