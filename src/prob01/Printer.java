package prob01;

public class Printer {

//	public void println(int i) {
//		System.out.println(i);
//	}
//
//	public void println(boolean b) {
//		System.out.println(b);
//	}
//
//	public void println(double d) {
//		System.out.println(d);
//	}
//
//	public void println(String string) {
//		System.out.println(string);
//	}
//
//	public void println(int i, boolean b, double d, String string) {
//		System.out.println(i + " : " + b + " : " + d + " : " + string);
//	}

	public <T> void println(T t) {
		System.out.println(t);
	}

//	public int sum(int a, int b) {
//		return 0;
//	}
//	
//	public int sum(int a, int b, int c) {
//		return 0;
//	}
//	
//	public int sum(int a[]) {
//		return 0;
//	}

	// 가변 변수
	public int sum(int... nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		return sum;
	}

	// 가변변수
	@SuppressWarnings("unchecked")
	public <T> void println(T... ts) {
		for (T t : ts) {
			System.out.println(t);
		}
	}

}
