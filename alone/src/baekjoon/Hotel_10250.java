package baekjoon;

import java.util.Scanner;

public class Hotel_10250 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int t = sc.nextInt(); // 테스트 횟수

		for (int i = 0; i <= t; i++) {
			int h = sc.nextInt(); // 호텔 층수
			int w = sc.nextInt(); // 각 층의 방수
			int n = sc.nextInt(); // 몇번째 손님인지?

			int x, y;
			
			if(n % h == 0) { // 맨 윗층의 경우
				x = h;
				y = n / h;
			}
			else { // 맨 위층 제외하고
				if (n < h) // xx01호실의 경우(맨 앞줄의 경우)
					x = n;
				else
					x = (n % h);
					y = (n / h) + 1;
			}
			System.out.println("총 " + h + "층에 층마다 " + w + "개의 방이 있는 호텔입니다.");
			System.out.println(n + "번째 손님의 방은 " + (x * 100 + y) + "호실입니다.");
		}
	}
}
