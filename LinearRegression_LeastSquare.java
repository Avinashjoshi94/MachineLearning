//By Avinash Joshi
//Here the equation of line is y=ax+b for linear regression by least square regression
//The values of a and b are calculated and are roundup by 2 decimal places

import java.util.Scanner;

public class LinearRegression_LeastSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Enter number of coordinates : ");
		n = scanner.nextInt();	
		float x[] = new float [n] ;
		float y[] = new float [n] ;
		float sum_x = 0f,sum_y = 0f,sum_xy = 0f,sum_x_square = 0f;
		for (int i = 0; i < n; i++) {
			System.out.print("Enter Value for x["+(i+1)+"]");
			x[i]=scanner.nextFloat();
			System.out.print("Enter Value for y["+(i+1)+"]");
			y[i]=scanner.nextFloat();
			System.out.println("");
			sum_x = x[i] + sum_x;
			sum_y = y[i] + sum_y;
			sum_xy = x[i]*y[i] + sum_xy;
			sum_x_square = x[i]*x[i]+ sum_x_square;
		}

		System.out.println("sum_x:	"+sum_x);
		System.out.println("sum_y:	"+sum_y);
		System.out.println("sum_xy: "+sum_xy);
		System.out.println("sum_x_square: "+sum_x_square);
		System.out.println();
		float a = 0f;
		a = ((n*sum_xy-sum_x*sum_y)/((n*sum_x_square)-(sum_x)*(sum_x)));
		float b = 0f;
		b = ((sum_y-a*sum_x)/n);
		System.out.printf("a : %.2f",a);
		System.out.println();
		System.out.printf("b : %.2f",b);
		scanner.close();
	}

}
