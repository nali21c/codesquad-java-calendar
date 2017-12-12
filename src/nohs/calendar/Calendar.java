package nohs.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {

		System.out.println("일  월  화 수 목 금  토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		// 월을 입력하면 그 달이 몇일로 구성되어 있는지 출력하는 프로그램

		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println("달을 입력하세요");
		String month = scanner.nextLine();
		a = Integer.parseInt(month);

		int[] b = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

		System.out.println(b[a-1]);
		System.out.println(a);
	}

}
