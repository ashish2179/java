public class Factorial {
	public static void main(String[] args) {
		System.out.println("factorial of 10 is " + fact(10));
	}
	public static int fact(int a){
		if(a==1)
			return 1;
		else
			return a*fact(a-1);
	}
}