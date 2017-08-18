package testTaskForIntetics.firstTest;

/**
 * Напишите программу, которая возвращает наибольшее число палиндром, которое
 * является произведением двух простых пятизначных чисел, а также возвращает
 * сами сомножители. Простое число - это натуральное число, которое делится
 * нацело только на 1 и на себя само (2, 3, 5, 7, 11, …) Палиндром – строка,
 * которая читается одинаково в обоих направлениях (например ABBA)
 */
public class Runner {

	public static void main(String[] args) {
		int maxNumber = 99999;
		int minNumber = 10000;
		MaxPalindrome resalt = new MaxPalindrome();
		resalt.calculateMaxPolindrom(maxNumber, minNumber);

		System.out.println("Наибольшее число палиндром "+ resalt.getMaxPalindrome());
		System.out.println(
				"Простые пятизначные числа " + resalt.getFirstMultiplier() + " и " + resalt.getSecondMultiplier());

	}
}
