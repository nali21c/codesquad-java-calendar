package nohs.calendar;

import java.util.Scanner;

public class Prompt {

	public void runPrompt() {

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

	private final static String PROMPT = "cal> ";

	public static void main(String[] args) {

		// 숫자를 입력받아 해당하는 달의 최대 월수는 출력하는 프로그램

	}
}
