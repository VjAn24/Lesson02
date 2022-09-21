import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		double a,b,c,d,e;
		System.out.println("Для решения уравнения введите первое число:");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		System.out.println("Введите второе число:");
		b=scanner.nextDouble();
		System.out.println("Введите третье число:");
		c=scanner.nextDouble();
		System.out.println("Введите четвертое число:");
		d=scanner.nextDouble();
		e=(a/c)*(b/d)-((a*b-c)/c*d);
		System.out.println("Ваш результат="+e);

	}

}
