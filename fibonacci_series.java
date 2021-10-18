import java.util.Scanner;
public class fibonacci_series {

	public static void main(String[] args) {
		
		int x1=0, x2=1, x3, i, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		n = sc.nextInt();
		System.out.print(x1+" "+x2);
		for(i=2;i<n;i++) {
			x3=x1+x2;
			System.out.print(" "+x3);
			x1=x2;
			x2=x3;
		}
				
	}

}
