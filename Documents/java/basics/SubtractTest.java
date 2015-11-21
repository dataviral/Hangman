/* Testing why 1-0.1-0.1-0.1-0.1-0.1 = 0.5000000000000001 and not = 0.5 (since 1 - 0.5 = 0.5) */

class SubtractTest {
    public static void main(String[] args) {
        double sum;
		
		sum = 1 - 0.1 - 0.1 - 0.1 -0.1 - 0.1;
		System.out.println(sum);
	}
}
