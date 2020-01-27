package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// 첫째 줄에 나무의 수 N과 상근이가 집으로 가져가려고 하는 나무의 길이 M이 주어진다. (1 ≤ N ≤ 1,000,000, 1 ≤ M ≤ 2,000,000,000)
// 둘째 줄에는 나무의 높이가 주어진다. 나무의 높이의 합은 항상 M을 넘기 때문에, 상근이는 집에 필요한 나무를 항상 가져갈 수 있다.
// 나무의 높이는 1,000,000,000보다 작거나 같은 양의 정수 또는 0이다.
// 적어도 M미터의 나무를 집에 가져가기 위해서 절단기에 설정할 수 있는 높이의 최댓값을 출력한다.
// 예제:
//	4 7
//	20 15 10 17 
// 출력 : 15
public class TreeCut_2805 {
	static Scanner sc = new Scanner(System.in);

	static void tree() {
		int n = sc.nextInt(); // 나무의 수
		int m = sc.nextInt(); // 가져갈 나무의 길이
		int[] arr = new int[n]; // 나무들의 높이를 저장할 배열

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // 나무를 높이 순으로 정렬
		System.out.println(bSearch(arr, 0, 2000000000, m));
	}

	public static int bSearch(int[] arr, int s, int e, int target) {
		while (s <= e) {
			int mid = (s + e) / 2;
			if (slice(arr, mid, target)) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return e;
	}

	public static boolean slice(int[] arr, int h, int target) {
		long sum = 0;
		for (int v : arr) {
			sum += v - h > 0 ? v - h : 0; // (나무높이-절단기높이)가 양수일 때 sum값 증가
		}
		if (sum >= target) { // sum값이 집에 가져갈 나무의 길이보다 커졌을 때
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		tree();
	}
}
