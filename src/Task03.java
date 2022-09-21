import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		double a,b,c,d;
		System.out.println("Для решения уравнения введите первое число:");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();
		System.out.println("Введите второе число:");
		b=scanner.nextDouble();
		System.out.println("Введите третье число:");
		c=scanner.nextDouble();
		
		d=a*a-Math.pow((b-c),2) + Math.log((b*b+1));
		
		System.out.println("Результат вашего уравнения =" +d);
		
		

	}

}
