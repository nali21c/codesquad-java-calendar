package nohs.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		System.out.println("두수를 입력하세요");
		int a,b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		s1 = scanner.nextLine(); //스캐너는 반듯이 String이여야함
		s2 = scanner.nextLine();
//		System.out.println(s1+"+"+s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.printf("%d+%d=%d",a,b,a+b);
		scanner.close();
	}

}
