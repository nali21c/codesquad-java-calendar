package nohs.calendar;

import java.util.Scanner;

public class Calendar {
	private final int[] Max_Date = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

	public int getMaxDaysOfMonth(int month) {
		return Max_Date[month - 1];
	}

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대 월수는 출력하는 프로그램

		String PROMPT = "Cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();

		int month = 1;

		while (true) {
			System.out.println("달을 입력하세요");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다\n", month, cal.getMaxDaysOfMonth(month));
		}
		System.out.println("BYE~");
		scanner.close();
	}
}