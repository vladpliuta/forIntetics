package testTaskForIntetics.firstTest;

import java.util.ArrayList;
import java.util.List;
/**
 * Основная логика по нахождению палиндрома
 */
public class MaxPalindrome {
	
	private int firstMultiplier;
	private int secondMultiplier;
	private long maxPalindrome;
	/**
	 * Вычисляем палиндром и его множители
	 */
	public void calculateMaxPolindrom(int maxNumber, int minNumber) {
		List<Integer> simples = new ArrayList<Integer>();
		for (int i = minNumber; i <= maxNumber; i++) {
			if (isSimple(i)) {
				simples.add(i);
			}
		}
		for (int i = 0, j = 0; i < simples.size(); i++, j++) {
			for (int k = j; k < simples.size(); k++) {

				long multiplyResalt = (long) simples.get(i) * (long) simples.get(k);
				if (checkPalindrome(multiplyResalt) && multiplyResalt > maxPalindrome) {
					maxPalindrome = multiplyResalt;
					firstMultiplier = simples.get(i);
					secondMultiplier = simples.get(k);
				}
			}
		}
	}

	public int getFirstMultiplier(){
		return firstMultiplier;
	}
	public int getSecondMultiplier(){
		return secondMultiplier;
	}
	public long getMaxPalindrome(){
		return maxPalindrome;
	}
	
	/**
	 * Является ли число простым?
	 */
	private boolean isSimple(int number) {
		boolean isSimple = true;
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				isSimple = false;
				break;
			}
		}
		return isSimple;
	}

	/**
	 * Является ли число палиндромом?
	 */
	private boolean checkPalindrome(long multiplyResalt) {
		if (multiplyResalt % 10 == 0) {
			return false;
		}

		String forward = Long.toString(multiplyResalt);
		String reverse = new StringBuilder(forward).reverse().toString();

		if (forward.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}
}
