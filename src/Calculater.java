
public class Calculater {
	void squareNumber(double decimal) {
		double answer = decimal * decimal;
		System.out.println(answer);
	}
	
	void factorial(int number) {
		int answer = 1;
		while(number != 1) {
			answer *= number;
			number--;
		}
			System.out.println(answer);
	}
	
}
