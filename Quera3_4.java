import java.util.Scanner;
import  java.lang.Math;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
		int	b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		
		
		int k1 = Math.abs(a - b);
		int k2 = Math.abs(c - d);
		
		double max1 =(a + b + k1) / 2;
		double min1 =(a + b - k1) / 2;
		
		double max2 =(c + d + k2) / 2;
		double min2 =(c + d - k2) / 2;
		
		
		double k3 = Math.abs(max1 - max2);
		double k4 = Math.abs(min1 - min2);
		

		double Sum = a+b+c+d;
		double Average =(double)(a+b+c+d)/4;
		double Product =a*b*c*d;
		double MAX =(max1 + max2 + k3) / 2;
		double MIN =(min1 + min2 - k4) / 2;
		
		
		System.out.printf( "Sum : %.6f\nAverage : %.6f\nProduct : %.6f\nMAX : %.6f\nMIN : %.6f\n" , Sum,Average,Product,MAX,MIN);

	
		
		
    }

}
