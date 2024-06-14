package javachallenge1;

public class SquareRoot {

	public static void main(String[] args) {
		int num = 4;
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
