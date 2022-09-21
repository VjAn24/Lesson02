import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		double a,b,c;
		System.out.println("Для решения уравнения введите первое число:");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		System.out.println("Введите второе число:");
		b=scanner.nextDouble();
		System.out.println("Введите третье число:");
		c=scanner.nextDouble();
		if (a>0) {
			a=Math.pow(a, 2);
			} else {
				a=Math.pow(a,4);
				}
		if (b>0) {
			b=Math.pow(b, 2);
			} else {
				b=Math.pow(b,4);
			}
		if (c>0) {
			c=Math.pow(c, 2);
			} else {
				c=Math.pow(c,4);
			}
		System.out.println("Ваш результат по задаче: первое число"+a+"\nВторое число"+b+"\nТретье значение"+c);
		
		
		

	}

}
