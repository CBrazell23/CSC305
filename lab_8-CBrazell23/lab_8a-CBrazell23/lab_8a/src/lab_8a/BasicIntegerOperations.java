package lab8a;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class BasicIntegerOperations{
	static void displaySquare(int num, Consumer<Integer> squared) {
		squared.accept(num);
	}
	static boolean isNegative(int num, Predicate<Integer> negated) {
		return negated.test(num);
	}
	static Double squareRoot(int num, Function<Integer, Double> sqrted) {
		return sqrted.apply(num);
	}
	
	public static void main(String[] args) {
		
		Integer num = 10;

		displaySquare(num, x -> System.out.print(x * x));
		
		if(!(isNegative(num, x -> x < 0))) {
			System.out.println("Square root of " + num + ": " + squareRoot(num, x -> Math.sqrt(x)));	
		}		
	}
}
