package ScannerEx;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� >>");
		
		int a = scanner.nextInt();
		String b = scanner.next();
		int c = scanner.nextInt();
		int result;
		
		switch (b) {
			case "+":
				result = a+c;
				System.out.print(a+b+c+"�� ��� �����"+result);
				break;
			case "-":
				result = a-c;
				System.out.print(a+b+c+"�� ��� �����"+result);
				break;
			case "*":
				result = a*c;
				System.out.print(a+b+c+"�� ��� �����"+result);
				break;
			case "/":
				if (c==0) {
					System.out.print("0���� ���� �� �����ϴ�.");
					break;
				} else {
					result = a/c;
					System.out.printf(a+b+c+"�� ��� �����"+result);
					break;
				}
			default:
				System.out.printf("�߸� �Է��ϼ̽��ϴ�.");
		}
		
		scanner.close();
		
	}

}
