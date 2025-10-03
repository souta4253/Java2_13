import java.util.Scanner;

public class CalculaterApp {

	public static void main(String[] args) {
		Calculater calc = new Calculater();
		Scanner scanner = new Scanner(System.in);
		System.out.println("---電卓アプリ---");
		
		System.out.println("実行する計算を1つ選んで数字で答えてください");
		System.out.println("1.平方数");
		System.out.println("2.階乗");
		
		int number = scanner.nextInt();
		if(number == 1) {
			System.out.println("数字をひとつ入力してください");
			double argument = scanner.nextDouble();
			calc.squareNumber(argument);
			System.out.println("プログラムを終了します");
		}else if(number == 2){
			System.out.println("正の整数をひとつ入力してください");
			int argument1 = scanner.nextInt();
			calc.factorial(argument1);
			System.out.println("プログラムを終了します");
		}else {
			System.out.println("数字が違います。プログラムを終了します");
		}
		scanner.close();
	}

}
