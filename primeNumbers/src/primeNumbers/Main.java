package primeNumbers;
import java.util.*;
public class Main {
	static Scanner console = new Scanner(System.in);
	public static void main(String[]args) {
		System.out.print("Enter a number: ");
		int N = console.nextInt();
		for(int i=2; i<N; i++) {
			if(checkPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	static boolean checkPrime(int N) {
		for(int i=2; i<=N/2; i++) {
			if(N%i==0) {
				return false;
			}
		}
		return true;
	}
}
