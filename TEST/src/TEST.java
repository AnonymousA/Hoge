public class TEST {
	int number;
	TEST(int z) { number = z; }
	public static void main(String[] args) {
		TEST a = new TEST(100);
		TEST b = a;
		System.out.println(a.number + ":" + b.number);
		a.number = 0;
		System.out.println(a.number + ":" + b.number);
		String[] NN = new String[10];
		main(NN);
	}
}
