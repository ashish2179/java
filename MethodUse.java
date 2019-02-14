public class MethodUse {
	public static void main(String[] args) {
		power2exp6();
		power2(10);
	}
	public static void power2exp6() {
    System.out.println("2 to the 6 = 64");
	}
	public static void power2(int exp) {
    int result = 1;
    for (int i = 1; i <= exp; i++) {
        result *= 2;
    }
    System.out.println("2 to the " + exp + " = " + result);
}
}