package ScannerEx;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연산 >>");
		
		int a = scanner.nextInt();
		String b = scanner.next();
		int c = scanner.nextInt();
		int result;
		
		switch (b) {
			case "+":
				result = a+c;
				System.out.print(a+b+c+"의 계산 결과는"+result);
				break;
			case "-":
				result = a-c;
				System.out.print(a+b+c+"의 계산 결과는"+result);
				break;
			case "*":
				result = a*c;
				System.out.print(a+b+c+"의 계산 결과는"+result);
				break;
			case "/":
				if (c==0) {
					System.out.print("0으로 나눌 수 없습니다.");
					break;
				} else {
					result = a/c;
					System.out.printf(a+b+c+"의 계산 결과는"+result);
					break;
				}
			default:
				System.out.printf("잘못 입력하셨습니다.");
		}
		
		scanner.close();
		
	}

}
