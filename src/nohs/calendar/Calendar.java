package nohs.calendar;

import java.util.Scanner;

public class Calendar {
	private final int[] Max_Date = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

	public int getMaxDaysOfMonth(int month) {
		return Max_Date[month - 1];
	}

	public static void main(String[] args) {

		System.out.println("반복 횟수를 입력하세요");
		Scanner repeat = new Scanner(System.in);
		int time = repeat.nextInt();
		

		System.out.println("월을 입력하세요");
		Calendar cal = new Calendar();

		int[] month = new int[time - 1];

		for (int i = 0; i <= month.length; i++) {
			Scanner scanner = new Scanner(System.in);
			month[i] = scanner.nextInt();
		
		}
		 
		 for(int j=0; j <= month.length; j++) {
		 System.out.printf("%d달의 마지막 날은 %d입니다\n", month[j],
		 cal.getMaxDaysOfMonth(month[j]));
		 }
		
	}

}