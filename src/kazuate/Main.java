package kazuate;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void  main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		int answer = 1 + random.nextInt(10);
		int number = 0;
		int count = 1;

		do {
			System.out.println("数字を入力してください。");
			String line = scanner.nextLine();
			number = Integer.parseInt(line);

			if(number > answer) {
				System.out.println("数字が大きいです。");
			}
			else if(number < answer) {
				System.out.println("数字が小さいです。");
			}
			else {
				System.out.println("正解です。");
				System.out.println(count + "回で正解しました。");
			}
			count ++;
		} while(number != answer);

		scanner.close();
	}
}
