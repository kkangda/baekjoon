package baekjoon;

// (1 ≤ M ≤ N ≤ 8)
// 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
public class NandM_15649 {
	static boolean[] c = new boolean[10];
	static int[] a = new int[10];
	
	static void func(int index, int n, int m) {
		if(index == m) {
			for(int i=0;i<m;i++) {
				System.out.print(a[i]);
				if(i!=m-1)
					System.out.print(' ');
			}
			System.out.println();
			return;
		}
		for(int i=1;i<=n;i++) {
			if(c[i]) {
				continue;
			}
			c[i] = true;
			a[index] = i;
			func(index + 1,n,m);
			c[i] = false;
		}
	}
	public static void main(String[] args) {
		func(0,4,3);
	}
}
