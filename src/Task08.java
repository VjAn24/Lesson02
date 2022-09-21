
public class Task08 {

	public static void main(String[] args) {
		double a,b,c,fx,x;
		a=1;
		b=10;
		c=1;
		x=a;
		
		
		while (x!=b+1) {
			fx=2*Math.tan(x/2)+1;
			System.out.println("\t"+fx);
			x=x+c;
		}

	}

}
