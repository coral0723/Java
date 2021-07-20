package practice;
import java.util.Scanner;

abstract class Converter{
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio;
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
		System.out.print(getSrcString()+"을 입력하세요>> ");
		double val = scanner.nextDouble();
		double res = convert(val);
		System.out.println("변환 결과: "+res+getDestString()+"입니다.");
		scanner.close();
	}
}

class Won2Dollor extends Converter{
	Won2Dollor(int ratio){
		this.ratio = ratio;
	}
	protected String getSrcString() {
		return "원";
	}
	protected String getDestString() {
		return "달러";
	}
	protected double convert(double src) {
		return src/ratio;
	}
	
}

class Km2Mile extends Converter{
	Km2Mile(double ratio){
		this.ratio = ratio;
	}
	protected String getSrcString() {
		return "Km";
	}
	protected String getDestString() {
		return "mile";
	}
	protected double convert(double src) {
		return src/ratio;
	}
}

public class Practice2 {

	public static void main(String[] args) {
		Km2Mile toDollor = new Km2Mile(1.6);
		toDollor.run();

	}

}
