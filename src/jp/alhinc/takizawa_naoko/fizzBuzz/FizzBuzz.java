/**
 *
 */
package jp.alhinc.takizawa_naoko.fizzBuzz;

/**
 * @author takizawa.naoko
 *
 */
public class FizzBuzz {


	/**
	 * @param args
	 */
	public static String Answer(int number) {
		// TODO 自動生成されたメソッド・スタブ
		String answer;

		if (number % 15 == 0) {
			System.out.println("FizzBuzz");
			answer = "FizzBuzz";
		} else if (number % 3 == 0) {
			System.out.println("Fizz");
			answer = "Fizz";
		} else if (number % 5 == 0) {
			System.out.println("Buzz");
			answer = "Buzz";
		} else {
			System.out.println(number);
			answer = String.valueOf(number);
		}

		return answer;



		}


}