import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		double a,b,c,d;
		System.out.println("Для решения уравнения введите первое число:");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		System.out.println("Введите второе число:");
		b=scanner.nextDouble();
		System.out.println("Введите третье число:");
		c=scanner.nextDouble();
		d=((b+Math.sqrt(Math.pow(b, 2) +4*a*c))/2*a)-Math.pow(a,3)*c+b;
		System.out.println("Ваш результат="+d);
	}

}
