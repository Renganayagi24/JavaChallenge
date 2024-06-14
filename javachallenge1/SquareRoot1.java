package javachallenge1;

public class SquareRoot1 {
	public static void main(String[] args) {
		int num = 8;
		double sqrt;
		System.out.println(sqareroot(num));
	}

	public static double sqareroot(int num)
	{
		double temp;
		double sqrt = num/2;
		do {
			temp = sqrt;
			sqrt =(temp+(num/temp))/2;
		}while((temp-sqrt)!=0);
			return sqrt;
	}

}
