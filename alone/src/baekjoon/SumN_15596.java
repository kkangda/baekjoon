package baekjoon;

import java.util.Scanner;

// 정수 n개가 주어졌을 때 n개의 합을 구하는 함수 작성하기
// long sum(int[] a);
// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
// 리턴값: a에 포함되어 있는 정수 n개의 합
public class SumN_15596 {
	static Scanner sc = new Scanner(System.in);
	static long sum(int[] a) {
		long sum = 0;
		for(int i=0;i<a.length;i++) {
			System.out.print("0에서 1,000,000 사이의 정수를 입력하세요>> ");
			int n = sc.nextInt();
			a[i] = n;
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("몇개의 정수를 더할 것인지 입력하세요>> ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println(sum(arr));
	}
}
